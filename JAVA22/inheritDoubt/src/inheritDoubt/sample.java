package inheritDoubt;

import EmailA.*;

public class sample {
	
	public static void main(String[] args) {
		Email e = new Email();
		e.sendEmail();
		e.sendEmail("123");
	}
}
