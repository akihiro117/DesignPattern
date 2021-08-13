package interpreter.command;

import interpreter.Code;

public class LoopCommand extends Command {
    private Integer num;

    private Command nextCommand;

    public LoopCommand(Integer num) {
        this.num = num;
    }

    @Override
    public void execute() {
        for (int i = 0; i < num; i++) {    
            nextCommand.execute();
        }
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
