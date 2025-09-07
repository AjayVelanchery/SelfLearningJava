package dev.ajay.beans.controller;

import dev.ajay.beans.Service.PostService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController

public class PostController {

    private PostService postService;


    public PostController(){

        this.postService=new PostService();
    }
@GetMapping
    public String  findAll(){
    return "";
}
}
