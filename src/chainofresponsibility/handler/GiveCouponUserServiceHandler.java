package chainofresponsibility.handler;

import chainofresponsibility.User;

public class GiveCouponUserServiceHandler extends UserServiceHandler {

    public GiveCouponUserServiceHandler(String handlerName) {
        super(handlerName);
    }

    @Override
    protected boolean resolve(User user) {
        if ("ゴールド会員".equals(user.getUserType())) {
            System.out.println("ゴールド会員なのでクーポンを付与します。");
            return true;
        }
        return false;
    }
    
}
