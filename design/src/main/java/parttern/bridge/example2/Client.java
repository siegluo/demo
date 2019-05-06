package parttern.bridge.example2;

public class Client {
	public static void main(String[] args) {
		Message m = new UrgencyMessageEmail();
		m.send("aa", "au");
		
		m = new CommonMessageEmail();
		m.send("aa", "au");
	}
}
