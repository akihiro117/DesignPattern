package memento;

import java.time.LocalDateTime;

public class UserMemento {
    private LocalDateTime savedTime;

    private int point;

    UserMemento(int point) {
        this.point = point;
    }

    int getPoint() {
        return this.point;
    }

    void setSavedTime(LocalDateTime savedTime) {
        this.savedTime = savedTime;
    }
}
