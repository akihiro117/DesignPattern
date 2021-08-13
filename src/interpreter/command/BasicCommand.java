package interpreter.command;

import interpreter.Code;

public class BasicCommand extends Command {
    private String text;

    private Command nextCommand;

    public BasicCommand(String text) {
        this.text = text;
    }

    @Override
    public void execute() {
        if (nextCommand != null) {
            nextCommand.execute();
        } else {
            System.out.println(text);
        }
    }

    @Override
    public void parse(Code code) {
        String currentCommandLine = code.getNextCommand();
        if (currentCommandLine == null || currentCommandLine.equals("")) {
            return;
        } else {
            String[] splitCurrentCommandLine = currentCommandLine.split(" ");
            String currentCommand = splitCurrentCommandLine[0];
            if (currentCommand.equals("LOOP")) {
                nextCommand = new LoopCommand(Integer.valueOf(splitCurrentCommandLine[1]));
                nextCommand.parse(code);
            } else {
                nextCommand = new BasicCommand(splitCurrentCommandLine[1]);
                nextCommand.parse(code);
            }
        }
    }
}
