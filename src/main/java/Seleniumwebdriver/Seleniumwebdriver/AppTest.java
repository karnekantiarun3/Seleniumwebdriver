package Seleniumwebdriver.Seleniumwebdriver;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

import java.io.IOException;

import org.testng.annotations.Test;

import com.mailosaur.MailosaurClient;
import com.mailosaur.MailosaurException;
import com.mailosaur.models.Message;
import com.mailosaur.models.MessageSearchParams;
import com.mailosaur.models.SearchCriteria;

public class AppTest {
	
  
  
  public AppTest() throws IOException, MailosaurException {
    // Available in the API tab of a server
    String apiKey = "qxnufEcygS5uipGnlIPGbP0aclkbDIIB";
    String serverId = "wishbk3w";
    String serverDomain = "zmnmoczw.mailosaur.net";

    MailosaurClient mailosaur = new MailosaurClient(apiKey);

    MessageSearchParams params = new MessageSearchParams();
    params.withServer(serverId);

    SearchCriteria criteria = new SearchCriteria();
    criteria.withSentTo("anything@" + serverDomain);

    Message message = mailosaur.messages().get(params, criteria);

    assertNotNull(message);
    assertEquals("My email subject", message.subject());
  }
}




