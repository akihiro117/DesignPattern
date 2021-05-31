package bridge;

public class CreditPayment extends AbstractPayment {

    @Override
    public void pay() {
        System.out.println("クレジット決済を行います。");
    }

    @Override
    public void notice() {
        System.out.println("メールで通知を行います。");
    }
    
}
