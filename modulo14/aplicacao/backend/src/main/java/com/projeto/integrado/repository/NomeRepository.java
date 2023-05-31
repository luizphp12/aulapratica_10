package com.projeto.integrado.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.projeto.integrado.entity.UsuarioNome;
import com.projeto.integrado.entity.User;

public interface NomeRepository extends JpaRepository<User, Integer> {
	Optional<Nome> findByNome(User UsuarioNome);
}
