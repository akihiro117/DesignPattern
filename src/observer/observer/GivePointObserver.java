package observer.observer;

import observer.observable.PaymentObservable;

public class GivePointObserver implements Observer {

    @Override
    public void recvNotification(PaymentObservable observable) {
        System.out.println(observable.getUserAccount() + "に" + (observable.getPrice() * 0.01) + "ポイントを付与します。");
    }
    
}
