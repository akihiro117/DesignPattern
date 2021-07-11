package observer.observer;

import observer.observable.PaymentObservable;

public interface Observer {
    public abstract void recvNotification(PaymentObservable observable);

    // 観察対象と観察者を新しく追加するときは、引数の異なるrecvNotificationメソッドを追加する。
}
