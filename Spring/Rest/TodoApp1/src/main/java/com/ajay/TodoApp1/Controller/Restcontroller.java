package com.ajay.TodoApp1.Controller;


import com.ajay.TodoApp1.Entity.Todo;
import com.ajay.TodoApp1.Service.Todoservice;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Restcontroller {

    private final Todoservice todoservice;

    public Restcontroller(Todoservice todoservice){

        this.todoservice=todoservice;
    }


    @GetMapping("/todos")

    public List<Todo> getAllTodos(){

        return todoservice.getAllTodos();
    }

    @GetMapping("/todos/{id}")
    public Todo getTodoById(@PathVariable int id){
        return todoservice.getTodoById(id);
    }

    @PostMapping("/todos")
    public Todo createTodo(@RequestBody Todo todo){
        return todoservice.createTodo(todo);
    }

    @PutMapping("/todos/{id}")
    public Todo updateTodo( @PathVariable int id,@RequestBody Todo todo) {
        return todoservice.updateTodo(id,todo.getTask(),todo.isCompleted());
    }


    @DeleteMapping("/todos/{id}")
    public void  deleteTodo(@PathVariable int id){
        todoservice.deleteTodo(id);
    }
}
