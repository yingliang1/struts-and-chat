package cs4230.struts;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import com.opensymphony.xwork2.ActionSupport;

public class SendChatAction extends ActionSupport {
	private String username;
	private String message;
	private static List<String> messages = new CopyOnWriteArrayList<String>();

	@Override
	public String execute() throws Exception {
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
