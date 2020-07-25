package com.infy.AngularFullStack.AngularFullStack.todoResourceController;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infy.AngularFullStack.AngularFullStack.todo.Todo;

@Repository
public interface TodoJpaRepository extends JpaRepository<Todo, Long> {

	List<Todo> findByUsername(String username);
}
