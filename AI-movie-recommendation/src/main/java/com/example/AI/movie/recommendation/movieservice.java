package com.example.AI.movie.recommendation;

import org.springframework.ai.chat.model.ChatModel;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.chat.prompt.PromptTemplate;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class movieservice {
    private final ChatModel chatModel;

    public movieservice(ChatModel chatModel) {
        this.chatModel = chatModel;
    }
    public String recmovie(String genre,
                           String relatedmvoies,
                           String imdb){
        var template= """
                I want to you reccommend me top 10 movies based on my criteria.
                here are some genres u should consider {genre}.
                here are the similar movies {relatedmovies} which i like.
                and i also want you to consider the imdb ratings as well which should be above {imdb}.
                so based on these reccommend me the top 10 movies.
                """;
        PromptTemplate promptTemplate = new PromptTemplate(template);
        Map<String, Object> params = Map.of(
                "genre", genre,
                "relatedmovies", relatedmvoies,
                "imdb", imdb
        );
        Prompt prompt = promptTemplate.create(params);
        return chatModel.call(prompt).getResult().getOutput().getContent();
    }
}
