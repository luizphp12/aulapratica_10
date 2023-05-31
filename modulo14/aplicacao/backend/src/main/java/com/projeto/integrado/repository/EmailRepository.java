package com.projeto.integrado.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.projeto.integrado.entity.UserEmail;
import com.projeto.integrado.entity.User;

public interface EmailRepository extends JpaRepository<User, Integer> {
	Optional<Tarefa> findByEmail(User UserEmail);
}
