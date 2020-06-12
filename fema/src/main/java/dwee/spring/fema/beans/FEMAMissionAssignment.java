package dwee.spring.fema.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


/**
 * Created by dean on 5/14/20.
 */
@JsonIgnoreProperties(ignoreUnknown = false)
public class FEMAMissionAssignment{

    private Metadata metadata;
    private List<MissionAssignment> missionAssignments;

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    @JsonProperty("MissionAssignments")
    public List<MissionAssignment> getMissionAssignments() {
        return missionAssignments;
    }

    @JsonProperty("MissionAssignments")
    public void setMissionAssignments(List<MissionAssignment> missionAssignments) {
        this.missionAssignments = missionAssignments;
    }

    @Override
    public String toString() {
        return "FEMAMissionAssignment{" +
                "metadata=" + metadata +
                ", missionAssignments=" + missionAssignments +
                '}';
    }
}
