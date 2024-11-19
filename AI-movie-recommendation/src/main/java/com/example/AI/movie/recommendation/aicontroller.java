package com.example.AI.movie.recommendation;

import com.azure.core.annotation.Get;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class aicontroller {
    private final chatservice chatservice;
    private final movieservice movieservice;

    public aicontroller(com.example.AI.movie.recommendation.chatservice chatservice, com.example.AI.movie.recommendation.movieservice movieservice) {
        this.chatservice = chatservice;
        this.movieservice = movieservice;
    }
    @GetMapping("ai")
    public String getresponse(@RequestParam String prompt){
        return chatservice.getresponse(prompt);
    }
    @GetMapping("aimovie")
    public String movierec(@RequestParam String genre,
                           @RequestParam(defaultValue = "any") String relatedmovies,
                           @RequestParam(defaultValue = "above 1.0") String imdb){
        return movieservice.recmovie(genre, relatedmovies, imdb);

    }
}
