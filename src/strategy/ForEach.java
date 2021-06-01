package strategy;

import java.util.ArrayList;
import java.util.List;

public class ForEach implements Loop {
    private final List<Integer> list;

    public ForEach(int listSize) {
        this.list = new ArrayList<>(listSize);
    }

    @Override
    public void doLoop() {
        list.forEach(i -> {
            return;
        });
    }

    @Override
    public String getName() {
        return "forEach";
    }
    
}
