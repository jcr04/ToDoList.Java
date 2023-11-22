package com.projetos.ToDoList.infrastructure.repository;

import com.projetos.ToDoList.domain.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    // Aqui você pode adicionar métodos de consulta personalizados se necessário
}
