package com.example.AI.movie.recommendation;

import org.springframework.ai.azure.openai.AzureOpenAiChatOptions;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.stereotype.Service;

@Service
public class chatservice {
    private final ChatModel chatModel;

    public chatservice(ChatModel chatModel) {
        this.chatModel = chatModel;
    }
    public String getresponse(String prompt){
        return chatModel.call(prompt);
    }
    public String getresponseoptions(String prompt){
        ChatResponse response = chatModel.call(
                new Prompt(
                        prompt,
                        AzureOpenAiChatOptions.builder().withTemperature(0.4).build()
                )
        );
        return response.getResult().getOutput().getContent();
    }
}
