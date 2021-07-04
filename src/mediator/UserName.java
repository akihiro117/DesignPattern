package mediator;

public class UserName implements PageComponent {
    private PageComponentMediator mediator;

    private String userName;

    @Override
    public void setMediator(PageComponentMediator mediator) {
        this.mediator = mediator;
    }

    public void setUserName(String userName) {
        this.userName = userName;
        mediator.process();
    }

    public String getUserName() {
        return userName;
    }
}
