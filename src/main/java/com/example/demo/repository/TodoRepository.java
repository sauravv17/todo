package com.example.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Todo;


public interface TodoRepository extends CrudRepository<Todo, Long>{

	List<Todo> findBytitle(String title);
}
