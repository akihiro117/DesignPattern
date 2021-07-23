package state.sate;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class BeginnerState implements UserState {
    private final UserState nextState;

    private final LocalDateTime registerDate;

    public BeginnerState(UserState nextState, LocalDateTime registerDate) {
        this.nextState = nextState;
        this.registerDate = registerDate;
    }

    @Override
    public UserState getNextState() {
        return this.nextState;
    }

    @Override
    public void printState() {
        System.out.println("新規ユーザーです。");
    }

    @Override
    public boolean doseChangeStatus() {
        return ChronoUnit.MONTHS.between(registerDate, LocalDateTime.now()) >= 1;
    }

    @Override
    public boolean doseChangeStatusForTest(int num) {
        return num > 10;
    }

    @Override
    public String getStateName() {
        return "新規ユーザー";
    }
}
