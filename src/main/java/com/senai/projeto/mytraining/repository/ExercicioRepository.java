package com.senai.projeto.mytraining.repository;

import com.senai.projeto.mytraining.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExercicioRepository extends JpaRepository<Usuario, Long> {
}
