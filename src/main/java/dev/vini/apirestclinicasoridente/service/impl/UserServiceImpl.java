package dev.vini.apirestclinicasoridente.service.impl;

import dev.vini.apirestclinicasoridente.domain.model.User;
import dev.vini.apirestclinicasoridente.domain.repository.UserRepository;
import dev.vini.apirestclinicasoridente.service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        if (userRepository.existsByCardNumber(userToCreate.getCard().getNumber())){
            throw new IllegalArgumentException("This card number already exists.");
        }
        return userRepository.save(userToCreate);
    }
}
