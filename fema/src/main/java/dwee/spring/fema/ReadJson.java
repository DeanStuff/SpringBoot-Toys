package dwee.spring.fema;

import com.fasterxml.jackson.databind.ObjectMapper;
import dwee.spring.fema.beans.FEMAMissionAssignment;

import java.io.File;
import java.io.IOException;


/**
 * Created by dean on 5/15/20.
 *
 * Quick tool to test parsing the json file received from the api
 */
public class ReadJson {

    public static void main (String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        FEMAMissionAssignment fma = objectMapper.readValue(new File("/home/dean/Downloads/MissionAssignments.json"), FEMAMissionAssignment.class);
        System.out.print(fma.toString());
    }
}
