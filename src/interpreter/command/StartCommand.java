package interpreter.command;

import interpreter.Code;

public class StartCommand extends Command {
    private Command nextCommand;

    @Override
    public void execute() {
       nextCommand.execute();
    }

    @Override
    public void parse(Code code) {
        String[] currentCommandLine = code.getNextCommand().split(" ");
        String currentCommand = currentCommandLine[0];
        if (currentCommand.equals("LOOP")) {
            nextCommand = new LoopCommand(Integer.valueOf(currentCommandLine[1]));
            nextCommand.parse(code);
        } else {
            nextCommand = new BasicCommand(currentCommandLine[1]);
            nextCommand.parse(code);
        }
    }
    
}
