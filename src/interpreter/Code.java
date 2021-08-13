package interpreter;

import java.util.ArrayList;
import java.util.List;

public class Code {
    private List<String> lines = new ArrayList<>();

    private int index;

    public String getNextCommand() {
        if (index < lines.size()) {
            String result = lines.get(index);
            index++;
            return result;
        } else {
            return null;
        }
    }

    public void addLine(String line) {
        lines.add(line);
    }
}
