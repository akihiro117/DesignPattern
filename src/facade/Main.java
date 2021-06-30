package facade;

public class Main {
    public static void main(String[] args) {
        SendEmail sendEmail = new SendEmail();
        sendEmail.send("test1@example.com", "test2@example.com", "Hello, Facade Pattern!");
    }
}
