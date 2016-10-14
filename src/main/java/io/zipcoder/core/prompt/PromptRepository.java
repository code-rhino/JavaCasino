package io.zipcoder.core.prompt;


import io.zipcoder.core.storage.Storage;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class PromptRepository {

    private Map<String, PromptMessage> repository;
    private Storage storage;

    public PromptRepository(Storage storage){
        this.storage = storage;
        loadPromptMessagesFromStorage();
    }

    public PromptMessage getMessageByTitle(String title){
        return repository.get(title);
    }

    private void loadPromptMessagesFromStorage(){
        PromptMessage[] messages = null;
        ObjectMapper mapper = new ObjectMapper();
        try {
            messages = mapper.readValue(storage.readData(), PromptMessage[].class);
            repository = populateRepositoryWithStorageData(messages);
        } catch (IOException exception){

        }
    }

    private Map<String, PromptMessage> populateRepositoryWithStorageData(PromptMessage[] messages){
        Map<String, PromptMessage> msgs = new HashMap<String, PromptMessage>();
        for(PromptMessage prompt : messages){
            msgs.put(prompt.getTitle(), prompt);
        }
        return msgs;
    }

}
