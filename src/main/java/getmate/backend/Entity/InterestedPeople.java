package getmate.backend.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class InterestedPeople {

    @JsonProperty
    int interestedcount;
    @JsonProperty
    List<String> interestedUserId;

    public int getInterestedcount() {
        return interestedcount;
    }

/*    public InterestedPeople(int interestedcount, List<User> interestedUserList) {
        this.interestedcount = interestedcount;
        this.interestedUserList = interestedUserList;
    }*/

    public List<String> getInterestedUserId() {
        return interestedUserId;
    }

    public void setInterestedUserId(List<String> interestedUserId) {
        this.interestedUserId = interestedUserId;
    }

    public void setInterestedcount(int interestedcount) {
        this.interestedcount = interestedcount;
    }


    public InterestedPeople() {
        interestedUserId = new ArrayList<>();
    }
}
