package strategy;

import java.util.ArrayList;
import java.util.List;

public class ForLoop implements Loop {
    private final List<Integer> list;

    public ForLoop(int listSize) {
        this.list = new ArrayList<>(listSize);
    }

    @Override
    public void doLoop() {
        for (int i = 0; i < list.size(); i++) {
        }
    }

    @Override
    public String getName() {
        return "For Loop";
    }
    
}
