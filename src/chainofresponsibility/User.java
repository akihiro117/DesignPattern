package chainofresponsibility;


public class User {
    private int userNo;
    
    private String userType;

    public User(int userNo, String userType) {
        this.userNo = userNo;
        this.userType = userType;
    }

    public int getUserNo() {
        return userNo;
    }

    public String getUserType() {
        return userType;
    }
}
