package command.print;

public class PrintText implements Print {
    private final String text;

    public PrintText(String text) {
        this.text = text;
    }

    @Override
    public void print() {
        System.out.println(text);
    }
    
}
