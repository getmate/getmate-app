package getmate.backend.Entity;


import org.springframework.data.annotation.Id;
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
    Location location;
    Going going;
    InterestedPeople interestedPeople;

    @DateTimeFormat
    String date;

    public Event() {
    }

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

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }



}
