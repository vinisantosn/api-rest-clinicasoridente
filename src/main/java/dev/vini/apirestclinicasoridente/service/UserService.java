package dev.vini.apirestclinicasoridente.service;

import dev.vini.apirestclinicasoridente.domain.model.User;

public interface UserService {
    User findById(Long id);
    User create(User userToCreate);
}
