package mediator;

public class UserStatus implements PageComponent {
    private PageComponentMediator mediator;

    private String userStatus;

    @Override
    public void setMediator(PageComponentMediator mediator) {
        this.mediator = mediator;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }

    public void displayUserStatus() {
        System.out.println("ユーザーステータス:" + userStatus);
    }
}
