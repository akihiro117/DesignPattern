package mediator;

public class Caution implements PageComponent {
    private PageComponentMediator mediator;

    private String cautionText;

    @Override
    public void setMediator(PageComponentMediator mediator) {
        this.mediator = mediator;
    }

    public String getCautionText() {
        return cautionText;
    }

    public void setCautionText(String cautionText) {
        this.cautionText = cautionText;
    }

    public void displayCaution() {
        System.out.println(cautionText != null ? cautionText : "注意文言はありません。");
    }
}
