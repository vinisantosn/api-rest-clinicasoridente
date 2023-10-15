package dev.vini.apirestclinicasoridente.domain.repository;

import dev.vini.apirestclinicasoridente.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    boolean existsByCardNumber(String cardNumber);
}
