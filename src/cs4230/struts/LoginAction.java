package cs4230.struts;

public class LoginAction {
	private String username;
	
	public String execute() {
		return "success";
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
}
