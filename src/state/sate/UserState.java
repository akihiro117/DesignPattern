package state.sate;

public interface UserState {
    UserState getNextState();
    void printState();
    boolean doseChangeStatus();
    boolean doseChangeStatusForTest(int num);
    String getStateName();
}
