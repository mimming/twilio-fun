import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

import java.net.URISyntaxException;

public class SendSms {


  // Find your Account Sid and Auth Token at twilio.com/console
  public static final String ACCOUNT_SID = "ACCOUNT_SID";
  public static final String AUTH_TOKEN = "AUTH_TOKEN";

  public static void main(String[] args) throws URISyntaxException {
    if(args.length > 0) {
      Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

      Message message = Message
          .creator(new PhoneNumber("TO_NUMBER"),  // to
              new PhoneNumber("FROM_NUMBER"),  // from
              args[0])
          .create();
      System.out.println("SMS sent!");
    } else {
      System.out.println("Usage:\n\njava -jar send-sms.jar 'message'");
    }
  }
}