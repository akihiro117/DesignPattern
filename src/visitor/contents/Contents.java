package visitor.contents;

import visitor.param.VisitorParam;
import visitor.visitor.Visitor;

public interface Contents {
    public abstract void accept(Visitor visitor, VisitorParam visitorParam);
}
