import sys
from twilio.rest import TwilioRestClient

# Find these values at https://twilio.com/user/account
account_sid = "ACCOUNT_SID"
auth_token = "AUTH_TOKEN"
client = TwilioRestClient(account_sid, auth_token)

if len(sys.argv) > 1:
	message = client.messages.create(to="TO_NUMBER", from_="FROM_NUMBER",
                                     body=sys.argv[1])
else:
  print('usage:\n\n', sys.argv[0], '<message to send>')
																

