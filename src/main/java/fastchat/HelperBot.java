package fastchat;

import java.time.LocalTime;
import java.util.Scanner;

public class HelperBot {
	
	public OutgoingMessage reply(String messageBody){
		
		if(messageBody.contains("time")){

			return new OutgoingMessage("Hi, I'm helperbot! It is " + LocalTime.now());
			
		} else if(messageBody.contains("plus")){
			
			return new OutgoingMessage("Hi, I'm helperbot! I can't do addition yet.");
			
		} else if(messageBody.contains("praise")){
			
			return new OutgoingMessage("Hi, I'm helperbot! You are very handsome.");
			
		} else if(messageBody.contains("say")){
			
			return new OutgoingMessage("Hi, I'm helperbot! I would like to say: " + messageBody.substring(10) + ".");
			
		} else {
			
			return new OutgoingMessage("Hi, I'm helperbot! Nice to meet you.");
			
		}
		
	}
	/*
	public static void main(String[] args){
		HelperBot hb = new HelperBot();
		System.out.println(hb.reply("yoyoyo").getContent());
		System.out.println(hb.reply("@helperbot time").getContent());
		System.out.println(hb.reply("@helperbot what is 3 plus 3?").getContent());
		System.out.println(hb.reply("@helpbot plus time").getContent());
		System.out.println(hb.reply("uahfauihfuiagfiuausiucavuiscuiui").getContent());
		System.out.println(hb.reply("@helperbot say hi").getContent());

	}
	*/
}
