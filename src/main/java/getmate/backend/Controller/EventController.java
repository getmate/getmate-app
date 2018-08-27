package getmate.backend.Controller;

import com.google.gson.Gson;
import org.json.JSONException;

import getmate.backend.Entity.Event;
import getmate.backend.Repository.EventRepository;
import org.json.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.data.geo.Distance;
import org.springframework.data.geo.Metrics;
import org.springframework.data.geo.Point;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/event")
public class EventController {
    EventRepository eventRepository;

    public EventController(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    @GetMapping("/all")
    public JSONObject getAll() throws JSONException, ParseException {
        List<Event> events = this.eventRepository.findAll();
        String json = new Gson().toJson(events);
        String ss = "{ \"eventlist\":" + json +"}";
        JSONParser parser = new JSONParser();
        JSONObject jsonfinal;
        jsonfinal = (JSONObject) parser.parse(ss);
        return jsonfinal;
    }
    @PutMapping("/composeevent")
    public void insert(@RequestBody Event event)
    {
        this.eventRepository.insert(event);
    }
    @DeleteMapping("/{eid}")
    public void delete(@PathVariable("eid") String eid)
    {
        this.eventRepository.deleteById(eid);
    }
    @PostMapping("/update")
    public void update(@RequestBody Event event)
    {
        this.eventRepository.save(event);
    }

    @PostMapping("/nearbyevent")
    public List<Event> getNearByLocation(@RequestBody Point location)
    {
        System.out.print(location.getX()+" "+location.getY());
        Distance distance = new Distance(200, Metrics.KILOMETERS);
        List<Event> EventResult = eventRepository.findByLocationNear(location,distance);

        return EventResult;
    }
}
