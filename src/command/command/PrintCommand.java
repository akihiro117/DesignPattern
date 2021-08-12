package command.command;

import command.print.Print;

public class PrintCommand implements Command {
    private final Print print;

    public PrintCommand(Print print) {
        this.print = print;
    }

    @Override
    public void execute() {
        print.print();
    }
}
