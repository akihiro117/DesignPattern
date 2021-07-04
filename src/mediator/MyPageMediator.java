package mediator;

public class MyPageMediator implements PageComponentMediator {
    private UserName userName;

    private Caution caution;

    private UserStatus userStatus;

    public MyPageMediator(UserName userName, Caution caution, UserStatus userStatus) {
        System.out.println("Mediatorを初期化します。");
        this.userName = userName;
        this.caution = caution;
        this.userStatus = userStatus;
        userName.setMediator(this);
        caution.setMediator(this);
        userStatus.setMediator(this);
    }

    @Override
    public void process() {
        if (userName.getUserName() == null) {
            caution.setCautionText("ユーザー名が設定されていません。");
            userStatus.setUserStatus("初級");
        } else {
            userStatus.setUserStatus("通常");
        }
    }
}
