package cs4230.struts;

import java.util.*;
import java.util.concurrent.*;

public class SendChatAction {
	private String username;
	private String message;
	private static List<String> messages = new CopyOnWriteArrayList<String>();
	
	public String execute() {
		messages.add(username + ": " + message);
		
		return "success";
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<String> getMessages() {
		return messages;
	}
}
