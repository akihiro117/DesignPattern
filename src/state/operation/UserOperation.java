package state.operation;

import java.time.LocalDateTime;
import java.util.stream.IntStream;

import state.sate.BeginnerState;
import state.sate.NormalUserState;
import state.sate.UserState;

public class UserOperation {
    private UserState userState;

    public UserOperation() {
        userState = new BeginnerState(new NormalUserState(), LocalDateTime.of(2021, 7, 1, 0, 0, 0));
    }

    public void operateUserState() {
        IntStream.range(0, 15).forEach(i -> {
            if (userState.doseChangeStatusForTest(i)) {
                System.out.println(userState.getStateName() + "から" + userState.getNextState().getStateName() + "に変わります。");
                changeUserState(userState.getNextState());
            }
            System.out.print(i + ":");
            userState.printState();
        });
    }

    private void changeUserState(UserState userState) {
        this.userState = userState;
    };
}
