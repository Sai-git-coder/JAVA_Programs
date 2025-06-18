package CompileTime;

public class MessageSenderCompileTime {
	void sendMessage(String message ) {
		System.out.println("Sending text message: " +message);
	}
	void sendMessage(String message, String recipient ) {
		System.out.println("Sending message to: "+recipient + ":" +message);
	}
	void sendMessage(String message, boolean isUrgent) {
		if(isUrgent)
			System.out.println("Urgent: " + message);
		else
			System.out.println("Sending message: " + message);
	}

	public static void main(String[] args) {
		MessageSenderCompileTime sender = new MessageSenderCompileTime();
		sender.sendMessage("Hello!");
		sender.sendMessage("Hello!", "Sai");
		sender.sendMessage("Server down!", true);
		

	}

}
