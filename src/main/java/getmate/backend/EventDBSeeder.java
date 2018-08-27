package getmate.backend;

import getmate.backend.Entity.*;
import getmate.backend.Repository.EventRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class EventDBSeeder implements CommandLineRunner
{
    EventRepository eventRepository;

    public EventDBSeeder(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    @Override
    public void run(String... args) throws Exception {

       /* User u3 = new User
                ("Arpit","CRGVEsSAAA","Male","Luv Adventurous, Indorii",
                        "9993098893","arpitgokuu24@gmail.com", "http://www.ifred.org/wp-content/uploads/2014/11/woman.jpg",
                        false,true, new String[]{"Csps"},
                        new String[]{"Medicaps","IIT Madras"},
                        Arrays.asList(new Work("Software Engineer","BatchMaster"),
                                new Work("Analyst","Goldman Sachs")),
                        Arrays.asList(( new Interest("Badminton","Sports",
                                        "https://www.badmintonengland.co.uk/image-cache/image-20627-848-427-both-both-85-5.jpg",2,400)),
                                new Interest("VolleyBall","Sports",
                                        "https://www.badmintonengland.co.uk/image-cache/image-20627-848-427-both-both-85-5.jpg",1,400)),
                        new Location(82.94,16.345),"22/02/1992");

        Event e1 = new Event("Swimming","Swimming Competition","2500 feet deep, 250m","https://www.gettyimages.ca/license/594378927","angelhoney123",
                new Location(8.1,12.9),new Going(1,Arrays.asList(u3)),new InterestedPeople(1,Arrays.asList(u3)),System.currentTimeMillis());
        this.eventRepository.deleteAll();
        List<Event> events = Arrays.asList(e1);
        this.eventRepository.saveAll(events);*/
    }
}
