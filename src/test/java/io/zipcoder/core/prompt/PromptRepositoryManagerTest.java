package io.zipcoder.core.prompt;

import io.zipcoder.core.prompt.PromptMessage;
import org.junit.Test;

import static io.zipcoder.core.prompt.PromptRepositoryManager.*;
import static org.junit.Assert.*;

public class PromptRepositoryManagerTest {

    @Test
    public void getMessageByTitleTest(){
        String title = "GameManagerWelcome";
        PromptMessage message = getMessageByTitle(title);
        assertEquals("Title message should be equal", title, message.getTitle());
    }
}
