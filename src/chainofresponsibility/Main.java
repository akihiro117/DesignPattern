package chainofresponsibility;

import java.util.Arrays;
import java.util.List;

import chainofresponsibility.handler.GiveCouponUserServiceHandler;
import chainofresponsibility.handler.GivePointUserServiceHandler;
import chainofresponsibility.handler.SendEmailUserServiceHandler;
import chainofresponsibility.handler.UserServiceHandler;

public class Main {
    public static void main(String[] args) {
        UserServiceHandler givePoint = new GivePointUserServiceHandler("ポイント付与");
        UserServiceHandler giveCoupon = new GiveCouponUserServiceHandler("クーポン付与");
        UserServiceHandler sendEmail = new SendEmailUserServiceHandler("メール配信");
        givePoint.setNextHandler(giveCoupon).setNextHandler(sendEmail);
        List<User> userList = Arrays.asList(new User(1, "プラチナ会員"), new User(2, "ゴールド会員"), new User(3, "シルバー会員"), new User(4, "ノーマル会員"));
        userList.stream().forEach(user -> givePoint.handle(user));
    }    
}
