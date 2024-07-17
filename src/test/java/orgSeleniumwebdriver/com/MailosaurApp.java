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

		public class MailosaurApp {
		  @Test public void testExample() throws IOException, MailosaurException {
		    // Available in the API tab of a server
		    String apiKey = "XODvcEyTRxqavqYLFvrLh0HUgRLSgsy0";
		    String serverId = "zmnmoczw";
		    String serverDomain = "zmnmoczw.mailosaur.net";

		    MailosaurClient mailosaur = new MailosaurClient(apiKey);

		    MessageSearchParams params = new MessageSearchParams();
		    params.withServer(serverId);

		    SearchCriteria criteria = new SearchCriteria();
		    criteria.withSentTo("asdas@" + serverDomain);

		    Message message = mailosaur.messages().get(params, criteria);

		    assertNotNull(message);
		    assertEquals("My email subject", message.subject());
		  }
		}

	


