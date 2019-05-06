package parttern.bridge.example1;

public class Client {
	public static void main(String[] args) {
		Message m = new CommonMessageSMS();
		m.send("aa", "au");
		
		m = new CommonMessageEmail();
		m.send("aa", "au");
	}
}
