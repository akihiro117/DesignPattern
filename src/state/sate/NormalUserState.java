package state.sate;

public class NormalUserState implements UserState {
    @Override
    public UserState getNextState() {
        return this;
    }

    @Override
    public void printState() {
        System.out.println("ノーマルユーザーです。");
    }

    @Override
    public boolean doseChangeStatus() {
        return false;
    }

    @Override
    public boolean doseChangeStatusForTest(int num) {
        return false;
    }

    @Override
    public String getStateName() {
        return "ノーマルユーザー";
    }
}
