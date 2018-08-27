package getmate.backend.Controller;


//import com.mongodb.client.model.geojson.Point;
//import com.mongodb.client.model.geojson.Position;
import com.mongodb.client.model.geojson.Position;
import getmate.backend.Entity.NearByUser;
import getmate.backend.Entity.User;
import getmate.backend.Entity.UserAuthentication;
import getmate.backend.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.geo.Distance;
import org.springframework.data.geo.GeoResult;
import org.springframework.data.geo.Metrics;
import org.springframework.data.geo.Point;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.index.GeospatialIndex;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
private UserRepository userRepository;
    //@Autowired MongoTemplate template;


    public UserController(UserRepository userRepository) {

        this.userRepository = userRepository;
       // template.indexOps(User.class).ensureIndex(new GeospatialIndex("location"));
    }

   @GetMapping("/all")
    public List<User> getAll()
    {
        List<User> users = this.userRepository.findAll();
        return users;
    }

    @PutMapping("/signup")
    public void insert(@RequestBody User user)
    {
       // System.out.print(user.getLocation().getCoordinates()+" user "+user.getLocation().getPosition());
            this.userRepository.insert(user);
    }

    @PostMapping("/update")
    public void update(@RequestBody User user)
    {
        this.userRepository.save(user);
    }

    @DeleteMapping("/{uid}")
    public void delete(@PathVariable("uid") String uid)
    {
        this.userRepository.deleteById(uid);
    }

    @GetMapping("/{uid}")
    public User getById(@PathVariable("uid") String uid)
    {
        User u = this.userRepository.findUsersByUid(uid);
        return u;
    }

   @PostMapping("/nearbylocation")
    public List<User> getNearByLocation(@RequestBody NearByUser nearByUser)
    {
     //  Position p = new Position(4.719364196442484,300.67360010824314);
     //   Point location = new Point(4.719364196442484,300.67360010824314);

        Distance distance = new Distance(200, Metrics.KILOMETERS);
       // Point location = new Point(12.9,80.7);
        List<User> userGeoResult = userRepository.findByLocationNear(nearByUser.getLocation(),distance);
        List<User> selectedUser = new ArrayList<>();
        for(User u:userGeoResult)
        {
            if(!u.getUid().equals(nearByUser.getUid()))
                selectedUser.add(u);
        }

        return selectedUser;
    }

    @PostMapping("/authentication")
    public User getAuthenticate(@RequestBody UserAuthentication userD)
    {
        User u = this.userRepository.findUsersByUid(userD.getUid());
        if(u.getPassword().equals(userD.getPassword()))
        {
        return u;}
        else return null;
    }

}

