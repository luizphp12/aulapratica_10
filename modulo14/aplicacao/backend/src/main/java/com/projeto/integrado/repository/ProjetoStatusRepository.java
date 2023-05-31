package com.projeto.integrado.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.projeto.integrado.entity.Projeto;

public interface ProjetoStatusRepository extends JpaRepository<User, Integer> {
	Optional<Status> findByProjetoStatus(User ProjetoStatus);
}
