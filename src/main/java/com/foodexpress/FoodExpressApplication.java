package com.foodexpress;

import com.foodexpress.entity.User;
import com.foodexpress.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FoodExpressApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(FoodExpressApplication.class, args);
    }

    @Autowired
    private UserRepository
            userRepository;


    @Override
    public void run(String... args) throws Exception {


        User user = new User();
        user.setId("user111");
        user.setName("Anuja Jadhav");
        user.setPassword("abc123");
        user.setEmail("anuja@gmail.com");

        user.setEnabled(true);
        user.setAvailable(true);

        userRepository.findById("user123").ifPresentOrElse(user1 -> {
            System.out.println("user is there");
        }, () -> {
            userRepository.save(user);
        });

    }
}
