package visitor.visitor;

import visitor.contents.Directory;
import visitor.contents.File;
import visitor.param.VisitorParam;

public abstract class Visitor {
    public abstract void visit(File file, VisitorParam visitorParam);
    public abstract void visit(Directory directory, VisitorParam visitorParam);
}
