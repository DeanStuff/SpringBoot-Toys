package dwee.spring.fema;

import dwee.spring.fema.beans.FEMAMissionAssignment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * Created by dean on 5/14/20.
 *
 * This is a SpringBoot example of pulling from the configured rest endpoint, configured in the
 * application.properties file.
 * It will read and prime the data, then you may access the results from this endpoint
 * http://localhost:8090/missionAssignments
 */
@SpringBootApplication
@Component
@ConfigurationProperties
public class FEMAConsumer {

	private static final Logger log = LoggerFactory.getLogger(FEMAConsumer.class);

    @Autowired
    private Environment env;

    public static void main(String[] args) {
		SpringApplication.run(FEMAConsumer.class, args);
	}

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Bean
    public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
        String femaUrl = env.getProperty("fema.missionAssignments.url");
        return args -> {
            FEMAMissionAssignment fma = restTemplate.getForObject(
                    femaUrl, FEMAMissionAssignment.class);
            log.info("FEMA results: " + fma.toString());
        };
    }

    @Bean
    public FEMAMissionAssignment getMissionAssignment() {
        RestTemplate rt = new RestTemplateBuilder().build();
        String femaUrl = env.getProperty("fema.missionAssignments.url", "https://www.fema.gov/api/open/v1/MissionAssignments");

        FEMAMissionAssignment fma = rt.getForObject(
                femaUrl, FEMAMissionAssignment.class);

        return fma;
    }
}
