package command.command;

import java.util.Stack;

public class MultiCommand implements Command {
    private Stack<Command> commandStack = new Stack<>();

    public void addCommand(Command command) {
        if (command != this) {
            commandStack.push(command);
        }
    }

    public Command removeLastCommand() {
        if (!commandStack.empty()) {
            return commandStack.pop();
        } else {
            return null;
        }
    }

    public void clear() {
        commandStack.clear();
    }

    @Override
    public void execute() {
        commandStack.stream().forEach(command -> command.execute());
    }
    
}
