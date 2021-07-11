package observer;

import observer.observable.PaymentObservable;
import observer.observable.PaymentToVideoObservable;
import observer.observer.GivePointObserver;
import observer.observer.Observer;
import observer.observer.SendEmailObserver;

public class Main {
    public static void main(String[] args) {
        Observer pointObserver = new GivePointObserver();
        Observer emailObserver = new SendEmailObserver();
        PaymentObservable paymentObservable = new PaymentToVideoObservable();
        paymentObservable.addObserver(pointObserver);
        paymentObservable.addObserver(emailObserver);
        paymentObservable.execute();
    }    
}
