package composite;

import java.util.ArrayList;
import java.util.List;

public class Div extends Tag {
    private List<Tag> tagList;

    public Div() {
        tagList = new ArrayList<>();
    }

    @Override
    public void add(Tag tag) {
        tagList.add(tag);
    }

    @Override
    public void write() {
        System.out.println("<div>");
        tagList.forEach(Tag::write);
        System.out.println("</div>");
    }

    @Override
    public String getName() {
        return "div";
    }
    
}
