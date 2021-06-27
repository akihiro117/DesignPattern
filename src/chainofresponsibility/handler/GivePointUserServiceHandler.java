package chainofresponsibility.handler;

import chainofresponsibility.User;

public class GivePointUserServiceHandler extends UserServiceHandler {

    public GivePointUserServiceHandler(String handlerName) {
        super(handlerName);
    }

    @Override
    protected boolean resolve(User user) {
        if ("プラチナ会員".equals(user.getUserType())) {
            System.out.println(user.getUserType() + "なので特別ポイントを付与します。");
            return true;
        }
        return false;
    }
    
}
