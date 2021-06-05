package composite;

public class Main {
    public static void main(String[] args) {
        Tag div1 = new Div();
        Tag div2 = new Div();
        Tag span = new Span("Hello, Composite Pattern!");
        div2.add(span);
        div1.add(div2);
        printSeparete();
        div1.write();
        printSeparete();
        div2.write();
    } 
    
    private static void printSeparete() {
        System.out.println("-------------------------");
    }
}
