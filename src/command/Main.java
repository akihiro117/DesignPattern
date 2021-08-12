package command;

import command.command.Command;
import command.command.MultiCommand;
import command.command.PrintCommand;
import command.print.Print;
import command.print.PrintText;

public class Main {
    public static void main(String[] args) {
        MultiCommand history = new MultiCommand();
        Print print = new PrintText("1.テストです。");
        Command command = new PrintCommand(print);
        command.execute();
        history.addCommand(command);
        Print print2 = new PrintText("2.テストです。");
        Command command2 = new PrintCommand(print2);
        command2.execute();
        history.addCommand(command2);
        System.out.println("今までの実行分を再実行します。");
        history.execute();
    }
}
