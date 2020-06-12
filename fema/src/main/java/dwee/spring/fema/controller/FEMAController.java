package dwee.spring.fema.controller;

import dwee.spring.fema.beans.FEMAMissionAssignment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dean on 5/15/20.
 */
@RestController
public class FEMAController {

    @Autowired
    private Environment env;

    @Autowired
    private FEMAMissionAssignment fma;

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @GetMapping("/missionAssignments")
    public FEMAMissionAssignment greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
//        FEMAMissionAssignment fma = new FEMAConsumer().getMissionAssignment();
        return fma;
    }

    public static void main(String[] args) {
		SpringApplication.run(FEMAController.class, args);
    }

}
