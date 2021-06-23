package visitor.contents;

import visitor.param.VisitorParam;
import visitor.visitor.Visitor;

public class File implements Contents {
    private String fileName;

    public File(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void accept(Visitor visitor, VisitorParam visitorParam) {
        visitor.visit(this, visitorParam);
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
