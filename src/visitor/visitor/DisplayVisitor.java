package visitor.visitor;

import visitor.contents.Directory;
import visitor.contents.File;
import visitor.param.VisitorParam;

public class DisplayVisitor extends Visitor {

    @Override
    public void visit(File file, VisitorParam visitorParam) {
        System.out.println(file.getFileName());
    }

    @Override
    public void visit(Directory directory, VisitorParam visitorParam) {
        System.out.println(directory.getDirName() + "/");
        directory.getContentsList().forEach(contents -> contents.accept(this, visitorParam));
    }
    
}
