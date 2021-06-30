package facade;

public class Email {
    private String to;
    
    private String from;

    private String text;

    public void setTo(String to) {
        this.to = to;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void sendEmail() {
        System.out.println(from + "から" + to + "にメールを送ります。");
        System.out.println("本文:" + text);
    }
}
