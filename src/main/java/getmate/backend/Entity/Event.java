package getmate.backend.Entity;


import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.geo.Point;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

@Document(collection = "event")
public class Event {

    @Id
    public String eid;
    String interestname;
    String title;
    String description;
    String event_imageUrl;
    String by_post;
    int interest_imageId;

    public int getInterest_imageId() {
        return interest_imageId;
    }

    public void setInterest_imageId(int interest_imageId) {
        this.interest_imageId = interest_imageId;
    }

    @JsonProperty
    Point location;
    @JsonProperty
    Going going;
    @JsonProperty
    InterestedPeople interestedPeople;

    public Event() {

    }

   /* public Event(String interestname, String title, String description, String event_imageUrl, String by_post, Location location, Going going, InterestedPeople interestedPeople, long date) {

        this.interestname = interestname;
        this.title = title;
        this.description = description;
        this.event_imageUrl = event_imageUrl;
        this.by_post = by_post;

        this.location = location;
        this.going = going;
        this.interestedPeople = interestedPeople;
        this.date = date;
    }
*/


    @DateTimeFormat
    Long date;



    public String getEid() {
        return eid;
    }

    public void setEid(String eid) {
        this.eid = eid;
    }

    public String getInterestname() {
        return interestname;
    }

    public void setInterestname(String interestname) {
        this.interestname = interestname;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEvent_imageUrl() {
        return event_imageUrl;
    }

    public void setEvent_imageUrl(String event_imageUrl) {
        this.event_imageUrl = event_imageUrl;
    }

    public String getBy_post() {
        return by_post;
    }

    public void setBy_post(String by_post) {
        this.by_post = by_post;
    }

    public Point getLocation() {
        return location;
    }

    public void setLocation(Point location) {
        this.location = location;
    }

    public Going getGoing() {
        return going;
    }

    public void setGoing(Going going) {
        this.going = going;
    }

    public InterestedPeople getInterestedPeople() {
        return interestedPeople;
    }

    public void setInterestedPeople(InterestedPeople interestedPeople) {
        this.interestedPeople = interestedPeople;
    }

    public Long getDate() {
        return date;
    }

    public void setDate(Long date) {
        this.date = date;
    }



}
