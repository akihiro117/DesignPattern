package bridge;

public class Payment {
    private final AbstractPayment abstractPayment;

    public Payment(AbstractPayment abstractPayment) {
        this.abstractPayment = abstractPayment;
    }

    public void pay() {
        abstractPayment.pay();
    }

    public void notice() {
        abstractPayment.notice();
    }

    public final void process() {
        pay();
        notice();
    }
}
