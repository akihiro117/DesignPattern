package observer.observable;

import java.util.ArrayList;
import java.util.List;

import observer.observer.Observer;

public abstract class PaymentObservable {
    private List<Observer> observerList;
    
    private Integer price;

    private String userAccount;

    public PaymentObservable() {
        observerList = new ArrayList<>();
    }

    public void addObserver(final Observer observer) {
        observerList.add(observer);
    }

    public void notifyToObservers() {
        observerList.forEach(observer -> observer.recvNotification(this));
    }

    public abstract void execute();

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }
}
