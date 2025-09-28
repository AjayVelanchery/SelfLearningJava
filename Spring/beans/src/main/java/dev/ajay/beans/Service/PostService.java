package dev.ajay.beans.Service;

import org.springframework.stereotype.Component;

@Component
public class PostService {


    public String findAll(){
        return "All posts are returned";
    }
}
