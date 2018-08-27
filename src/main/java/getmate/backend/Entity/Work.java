package getmate.backend.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Work{


    String position;

 /*   public Work(String position, String company) {
        this.position = position;
        this.company = company;
    }
*/
    public Work() {
    }

    String company;
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }


}
