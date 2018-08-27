package getmate.backend.Entity;
import org.springframework.data.annotation.Id;
import org.springframework.data.geo.Point;

public class NearByUser
{
Point location;
@Id
String uid;

    public NearByUser() {
    }

    public Point getLocation() {
        return location;
    }

    public void setLocation(Point location) {
        this.location = location;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }
}
