package chainofresponsibility.handler;

import chainofresponsibility.User;

public abstract class UserServiceHandler {
    private final String handlerName;

    private UserServiceHandler nextHandler;

    public UserServiceHandler(String handlerName) {
        this.handlerName = handlerName;
    }

    public UserServiceHandler setNextHandler(UserServiceHandler nextHandler) {
        this.nextHandler = nextHandler;
        return nextHandler;
    }

    public final void handle(User user) {
        System.out.println(handlerName + "で処理を試みています。");
        if (resolve(user)) {
            System.out.println(handlerName + "によって処理されました。");
        } else if(nextHandler != null) {
            System.out.println(handlerName + "で処理できないので" + nextHandler.getHandlerName() + "に処理を委譲します。");
            nextHandler.handle(user);
        } else {
            System.out.println("処理は行われませんでした。");
        }
    }

    protected abstract boolean resolve(User user);

    public String getHandlerName() {
        return handlerName;
    }
}
