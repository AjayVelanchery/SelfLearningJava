package com.ajay.TodoApp1.Service;

import com.ajay.TodoApp1.Entity.Todo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class Todoservice {


    private final List<Todo> todos=new ArrayList<>();


    public List<Todo> getAllTodos(){
        return todos;
    }


    public Todo getTodoById(int id){
        for(Todo todo:todos){
            if(todo.getId()==id){
                return todo;
            }
        }
        return null;
    }

    public Todo createTodo(Todo todo){
        todos.add(todo);
        return todo;
    }


    public Todo updateTodo(int id,String newTask,boolean newCompleted){
        for(Todo todo:todos){
            if(todo.getId()==id){
          todo.setCompleted(newCompleted);
          todo.setTask(newTask);
return todo;
        }}
    return null;
    }

    public void deleteTodo(int id){
     boolean removed=todos.removeIf(todo->todo.getId()==id);
     if(removed){
         System.out.println("todo deleted");
     }
     else {
         System.out.println("todo not deleted");
     }
    }


}
