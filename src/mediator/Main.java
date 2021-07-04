package mediator;

public class Main {
    public static void main(String[] args) {
        UserName userName = new UserName();
        UserStatus status = new UserStatus();
        Caution caution = new Caution();

        MyPageMediator mediator = new MyPageMediator(userName, caution, status);
        userName.setUserName("ユーザー1");
        caution.displayCaution();
        status.displayUserStatus();
        userName.setUserName(null);
        caution.displayCaution();
        status.displayUserStatus();
    }
}
