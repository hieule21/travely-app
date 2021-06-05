package io.hieule.travelyapp.h2bootstrap;

import io.hieule.travelyapp.model.TravelEntity;
import io.hieule.travelyapp.model.User;
import io.hieule.travelyapp.repository.TravelEntityRepository;
import io.hieule.travelyapp.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

/**
 * Created by Hieu Le on 6/2/2021
 */
@Profile(value = "dev")
@Component
@RequiredArgsConstructor
public class DataInitialization implements CommandLineRunner {
    private final UserRepository userRepository;
    private final TravelEntityRepository travelEntityRepository;
    private final PasswordEncoder passwordEncoder;


    @Override
    public void run(String... args) throws Exception {
        User user = User.builder()
                .firstName("Hieu")
                .lastName("Le")
                .email("hieule@gmail.com")
                .password(passwordEncoder.encode("123456"))
                .build();
        userRepository.saveAndFlush(user);
        TravelEntity travelEntity1 = TravelEntity.builder()
                .title("New York")
                .description("I have been to NY city and it was a great trip")
                .user(user)
                .build();
        TravelEntity travelEntity2 = TravelEntity.builder()
                .title("Sunnyvale")
                .description("Sunnyvale is a part of San Francisco")
                .user(user)
                .build();
        travelEntityRepository.saveAndFlush(travelEntity1);
        travelEntityRepository.saveAndFlush(travelEntity2);
    }
}
