package getmate.backend.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class Going
{
    @JsonProperty
    int goingcount;
    @JsonProperty
    List<String> goingUserId;

    public List<String> getGoingUserId() {
        return goingUserId;
    }

    public void setGoingUserId(List<String> goingUserId) {
        this.goingUserId = goingUserId;
    }

   /* public Going(int goingcount, List<User> goinguserlist) {
        this.goingcount = goingcount;
        this.goinguserlist = goinguserlist;
    }*/

   public Going() {
        goingUserId = new ArrayList<>();
    }

    public int getGoingcount() {
        return goingcount;
    }

    public void setGoingcount(int goingcount) {
        this.goingcount = goingcount;
    }


}
