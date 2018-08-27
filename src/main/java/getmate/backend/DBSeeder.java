package getmate.backend;

import getmate.backend.Repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DBSeeder implements CommandLineRunner{

    UserRepository userRepository;

    public DBSeeder(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) throws Exception {

/*
        this.userRepository.deleteAll();
        List<User> userss = Arrays.asList(u1,u2,u3);
        this.userRepository.saveAll(userss);*/
    }
}
