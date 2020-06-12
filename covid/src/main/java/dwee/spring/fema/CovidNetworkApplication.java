package dwee.spring.fema;

import dwee.spring.fema.entity.COVIDNetwork;
import dwee.spring.fema.repository.COVIDNetworkRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

import java.util.Arrays;
import java.util.List;


/**
 * Created by dean on 5/17/20.
 *
 * This is an example of a spring boot application.  It provides access to the configured
 * MYSQL instance and allows you to access the data by its rest endpoint
 * http://localhost:8090/test/covid?catchment=Entire%20Network
 *
 */
@SpringBootApplication
public class CovidNetworkApplication {

    private static final Logger log = LoggerFactory.getLogger(CovidNetworkApplication.class);

    @Autowired
    private Environment env;

    @Autowired
    private COVIDNetworkRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(CovidNetworkApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext appContext) {
        return args -> {

            System.out.println("Let's inspect the beans provided by Spring Boot:");
            log.info("Env prop for fema: " + env.getProperty("fema.missionAssignments.url"));
            log.info("Env prop for server port: " + env.getProperty("server.port"));

            List<COVIDNetwork> recs = repository.findByCatchment("Entire Network");

            for (COVIDNetwork cn : recs) {
                System.out.print("Rec: " + cn.toString());
            }

        };
    }

}
