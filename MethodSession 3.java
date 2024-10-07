class Email {
    public void sendEmail(String emailId, String subject) {
        System.out.println("Sending email to: " + emailId);
        System.out.println("Subject: " + subject);
    }
}

class PhoneCall {
    public void makeCall(String mobileNum, String name, String countryCode) {
        System.out.println("Calling " + name + " at number: " + countryCode + " " + mobileNum);
    }
}

class Login {
    public void performLogin(String email, String password) {
        System.out.println("Logging in with email: " + email);
        System.out.println("Password: " + password);
    }
}

public class Task3 {
    public static void main(String[] args) {
        
        Email email = new Email();
        email.sendEmail("heena@gmail.com", "Meeting Reminder");

        
        PhoneCall phoneCall = new PhoneCall();
        phoneCall.makeCall("9980339125", "Heena", "+91");

        
        Login login = new Login();
        login.performLogin("heena123@gmail.com", "password123");
    }
}
