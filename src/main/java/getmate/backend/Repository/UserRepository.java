package getmate.backend.Repository;


//import com.mongodb.client.model.geojson.Point;
import getmate.backend.Entity.User;
import org.springframework.data.geo.Distance;
import org.springframework.data.geo.GeoResult;

import org.springframework.data.geo.Point;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends MongoRepository<User,String>
{
    User findUsersByUid(String uid);
    List<User> findByLocationNear(Point location, Distance distance);

}
