package composite;

public class Span extends Tag {
    private String text;

    public Span(String text) {
        this.text = text;
    }

    @Override
    public void write() {
        System.out.println("<span>" + text + "</span>");
    }

    @Override
    public String getName() {
        return "span";
    }
    
}
