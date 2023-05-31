package com.projeto.integrado.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.projeto.integrado.entity.Projeto;
import com.projeto.integrado.entity.ProjetoStatus;

public interface ProjetoStatusRepository extends JpaRepository<ProjetoStatus, Integer> {
	Optional<Status> findByProjetoStatus(String projetoStatus);
}
