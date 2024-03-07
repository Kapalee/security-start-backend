package dat3.security_demo.configuration;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

//@Component
public class PasswordHashingExercise implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("###### Hashing Passwords ######");
        for(int strength = 10; strength < 18; strength++){
            long start = System.currentTimeMillis();
            PasswordEncoder passwordEncoder = new BCryptPasswordEncoder(strength);
            String encoded = passwordEncoder.encode("secret");
            long end = System.currentTimeMillis();
            System.out.println("Strength: " + strength + " Time: " + (end-start) + "ms");
        }
        System.out.println("###### Hashing Passwords ######");
    }
}
