package fastchat;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class MessageController {
	
	@MessageMapping("/hello")
	@SendTo("/topic/greetings")
	public OutgoingMessage greeting(IncomingMessage message) throws Exception {
		
		HelperBot helperBot = new HelperBot();
		
		Thread.sleep(50);
		
		if(message.getContent().length() > 10){
        	String messagePrefix = message.getContent().substring(0, 10);
	        if(messagePrefix.equals("@helperbot")){
	        	return helperBot.reply(message.getContent());
	        }
        }
		
		return new OutgoingMessage(message.getContent());
		
	}
	
}