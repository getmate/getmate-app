package getmate.backend.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
//import com.mongodb.client.model.geojson.Point;
import com.mongodb.client.model.geojson.Position;
import org.springframework.beans.factory.parsing.Location;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.geo.Point;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "user")
public class User {
    @Id
    public String uid;
    String username;
    String password, gender, intro, phone_no, email, imageUrl;
    boolean emailVerification, phoneVerification;
    String []school, college;
    String birthday;

    @JsonProperty
    List<Work> work;
    @JsonProperty
    List<Interest> interest;
    @JsonProperty
    Point location;

    public User()
    {
       // super();
        this.work = new ArrayList<>();
        this.interest = new ArrayList<>();
       // location = new Point(new Position(0,0));
        //new Point();
       // System.out.println(location.getPosition()+" "+location.getCoordinates()+" "+location.getType());
    }



    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

   /* public User(String username, String password, String gender, String intro, String phone_no, String email, String imageUrl, boolean emailVerification, boolean phoneVerification, String[] school, String[] college, List<Work> work, List<Interest> interest, Location location,
                String birthday) {

        this.username = username;
        this.password = password;
        this.gender = gender;
        this.intro = intro;
        this.phone_no = phone_no;
        this.email = email;
        this.imageUrl = imageUrl;
        this.emailVerification = emailVerification;
        this.phoneVerification = phoneVerification;
        this.school = school;
        this.college = college;
        this.work = work;
        this.birthday = birthday;
        this.interest = interest;

        this.location = location;
    }*/

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }



    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public boolean isEmailVerification() {
        return emailVerification;
    }

    public void setEmailVerification(boolean emailVerification) {
        this.emailVerification = emailVerification;
    }

    public boolean isPhoneVerification() {
        return phoneVerification;
    }

    public void setPhoneVerification(boolean phoneVerification) {
        this.phoneVerification = phoneVerification;
    }

    public String[] getSchool() {
        return school;
    }

    public void setSchool(String[] school) {
        this.school = school;
    }

    public String[] getCollege() {
        return college;
    }

    public void setCollege(String[] college) {
        this.college = college;
    }

    public List<Interest> getInterest() {
        return interest;
    }

    public void setWork(List<Work> work) {
        this.work = work;
    }

    public void setInterest(List<Interest> interest) {
        this.interest = interest;

    }

    public List<Work> getWork() {
        return work;
    }

    public Point getLocation() {
        return location;
    }
    public void setLocation(Point location) {
        this.location = location;
    }




}
