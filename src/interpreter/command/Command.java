package interpreter.command;

import interpreter.Code;

public abstract class Command {
    public abstract void parse(Code code);
    public abstract void execute();
}
