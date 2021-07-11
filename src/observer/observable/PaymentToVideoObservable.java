package observer.observable;

public class PaymentToVideoObservable extends PaymentObservable{

    @Override
    public void execute() {
        setPrice(1000);
        setUserAccount("hoge@example.com");
        System.out.println("動画を購入しました。");
        notifyToObservers();
    }
}
