package memento;

import java.time.LocalDateTime;

public class User {
    private int point;

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public UserMemento createMemento() {
        UserMemento memento = new UserMemento(this.point);
        memento.setSavedTime(LocalDateTime.now());
        return memento;
    }

    public void restoreMemento(UserMemento memento) {
        this.point = memento.getPoint();
    }
}
