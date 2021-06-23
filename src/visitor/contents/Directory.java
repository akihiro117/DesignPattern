package visitor.contents;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import visitor.param.VisitorParam;
import visitor.visitor.Visitor;

public class Directory implements Contents {
    private String dirName;

    private List<Contents> contentsList;

    public Directory(String dirName) {
        this.dirName = dirName;
        this.contentsList = new ArrayList<>();
    }

    @Override
    public void accept(Visitor visitor, VisitorParam visitorParam) {
        visitor.visit(this, visitorParam);
    }

    public String getDirName() {
        return dirName;
    }

    public void setDirName(String dirName) {
        this.dirName = dirName;
    }

    public List<Contents> getContentsList() {
        return contentsList;
    }

   public void addContents(Contents... contents) {
       Arrays.stream(contents).forEach(data -> this.contentsList.add(data));
   }
}
