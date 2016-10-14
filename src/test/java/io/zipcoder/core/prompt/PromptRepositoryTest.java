package io.zipcoder.core.prompt;

import io.zipcoder.core.prompt.PromptMessage;
import io.zipcoder.core.prompt.PromptRepository;
import io.zipcoder.core.storage.FileStorage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PromptRepositoryTest {

    private PromptRepository promptRepository;

    @Before
    public void setUp(){
        FileStorage fileStorage = new FileStorage("promptMessages.json");
        promptRepository = new PromptRepository(fileStorage);
    }


    @Test
    public void getMessageByTitleTest(){
        String messageTitle = "GameManagerWelcome";
        PromptMessage message = promptRepository.getMessageByTitle(messageTitle);
        Assert.assertEquals("Messages should be equal", messageTitle, message.getTitle());
    }
}
