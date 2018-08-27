package getmate.backend.Repository;

import getmate.backend.Entity.Event;
import org.springframework.data.geo.Distance;
import org.springframework.data.geo.Point;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface EventRepository extends MongoRepository<Event,String>
{

    List<Event> findByLocationNear(Point location, Distance distance);
    //@Query(value = "{location_lat:?0}")
    //List<Event> findBylatitude(double lat);
  //  List<Event> findEventsByLocationIsNearAndInterestname(Location location, String interestname);

}
