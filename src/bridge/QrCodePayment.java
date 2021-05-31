package bridge;

public class QrCodePayment extends AbstractPayment {

    @Override
    public void pay() {
        System.out.println("QR決済を行います。");
    }

    @Override
    public void notice() {
        System.out.println("アプリへ通知を行います。");
    }
    
}
