package chainofresponsibility.handler;

import chainofresponsibility.User;

public class SendEmailUserServiceHandler extends UserServiceHandler {

    public SendEmailUserServiceHandler(String handlerName) {
        super(handlerName);
    }

    @Override
    protected boolean resolve(User user) {
        if ("シルバー会員".equals(user.getUserType())) {
            System.out.println("シルバー会員なのでメール配信します。");
            return true;
        }
        return false;
    }
    
}
