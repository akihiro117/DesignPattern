package facade;

public class SendEmail {
    public void send(String to, String from, String text) {
        Email email = new Email();
        email.setTo(to);
        email.setFrom(from);
        email.setText(text);
        NetConnection.connect();
        email.sendEmail();
        NetConnection.close();
    } 
}
