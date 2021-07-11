package observer.observer;

import observer.observable.PaymentObservable;

public class SendEmailObserver implements Observer {

    @Override
    public void recvNotification(PaymentObservable observable) {
        System.out.println(observable.getUserAccount() + "にメール通知を行います。");        
    }
}
