package state;

import state.operation.UserOperation;

public class Main {
    public static void main(String[] args) {
        UserOperation userOperation = new UserOperation();
        userOperation.operateUserState();
    }
}
