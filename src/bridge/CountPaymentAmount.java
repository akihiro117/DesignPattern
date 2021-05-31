package bridge;

public class CountPaymentAmount extends Payment {

    public CountPaymentAmount(AbstractPayment abstractPayment) {
        super(abstractPayment);
    }
    
    public void countAmount() {
        System.out.println("合計支払い金額を計算します。");
    }
}
