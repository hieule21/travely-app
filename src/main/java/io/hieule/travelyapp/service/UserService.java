package io.hieule.travelyapp.service;

import io.hieule.travelyapp.model.TravelyUserDetails;
import io.hieule.travelyapp.model.User;
import io.hieule.travelyapp.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Created by Hieu Le on 6/2/2021
 */
@RequiredArgsConstructor
@Service
public class UserService implements UserDetailsService {
    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Optional<User> user = Optional.ofNullable(userRepository.findUserByEmail(email));
        if(!user.isPresent()) {
            throw new UsernameNotFoundException(email);
        }
        return new TravelyUserDetails(user.get());
    }
}
