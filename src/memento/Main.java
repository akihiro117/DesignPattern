package memento;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        UserMemento userMemento = user.createMemento();
        for (int i = 0; i < 10; i++) {
            user.setPoint(i);
            System.out.println("ポイント:" + user.getPoint());
            if (i == 5) {
                userMemento = user.createMemento();
            }
        }
        user.restoreMemento(userMemento);
        System.out.println("復元後ポイント:" + user.getPoint());
    }
}
