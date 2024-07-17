package orgSeleniumwebdriver.com;
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
	
	@Test
   
  public void AppTest() throws IOException, MailosaurException {
    // Available in the API tab of a server
    String apiKey = "qxnufEcygS5uipGnlIPGbP0aclkbDIIB";
    String serverId = "zmnmoczw";
    String serverDomain = "zmnmoczw.mailosaur.net";

    MailosaurClient mailosaur = new MailosaurClient(apiKey);

    MessageSearchParams params = new MessageSearchParams();
    params.withServer(serverId);

    SearchCriteria criteria = new SearchCriteria();
    criteria.withSentTo("anything@" + serverDomain);

    Message message = mailosaur.messages().get(params, criteria);
    System.out.println(message.subject());
    System.out.println(message.cc());
    System.out.println(message.bcc());
    System.out.println(message.to().get(0).email());

    assertNotNull(message);
    assertEquals("Tools Covered\r\n"
    		+ "PGP-ML: Scikit-learn, Pandas, NumPy, SciPy, Matplotlib PGP-AIML: Scikit-learn, Pandas, NumPy, SciPy, Matplotlib, Keras, TensorFlow, PyTorch, NLTK", message.subject());
  }
}