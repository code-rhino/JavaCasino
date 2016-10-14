package io.zipcoder.core.prompt;

import io.zipcoder.core.storage.FileStorage;

public class PromptRepositoryManager {

    private static PromptRepository repository;
    private static final String fileLocation = "promptMessages.json";

    static {
        repository = new PromptRepository(new FileStorage(fileLocation));
    }

    public static PromptMessage getMessageByTitle(String title){
        return repository.getMessageByTitle(title);
    }
}
