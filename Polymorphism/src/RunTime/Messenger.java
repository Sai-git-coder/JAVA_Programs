package RunTime;

public class Messenger {
	void send() {
		System.out.println("Sending a generic message");
	}
}
class WhatsAppMessenger extends Messenger {
	void send() {
		System.out.println("Sending via Whatsapp");
	}
}
class EmailMessenger extends Messenger {
	void send() {
		System.out.println("Sending via Email");
	}
	public static void main(String[] args) {
		Messenger messenger;
		
		messenger = new WhatsAppMessenger(); 
		messenger.send();
		
		messenger = new  EmailMessenger(); 
		messenger.send();
		
	}

}
