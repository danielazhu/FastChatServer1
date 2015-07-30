package fastchat;

public class OutgoingMessage {

	private String content;
	
	public OutgoingMessage(String content){
		
		this.content = content;
		
	}
	
	public String getContent(){
		return content;
	}
	
	public void setContent(){
		this.content = content;
	}
	
}
