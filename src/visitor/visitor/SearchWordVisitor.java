package visitor.visitor;

import visitor.contents.Directory;
import visitor.contents.File;
import visitor.param.SearchWordParam;
import visitor.param.VisitorParam;

public class SearchWordVisitor extends Visitor {

    @Override
    public void visit(File file, VisitorParam visitorParam) {
        SearchWordParam searchWordParam = (SearchWordParam) visitorParam;
        System.out.println(file.getFileName() + "で" + searchWordParam.getSearchWord() + "を検索します。");
    }

    @Override
    public void visit(Directory directory, VisitorParam visitorParam) {
        SearchWordParam searchWordParam = (SearchWordParam) visitorParam;
        System.out.println(directory.getDirName() + "で" + searchWordParam.getSearchWord() + "を検索します。");
        directory.getContentsList().stream().forEach(content -> content.accept(this, searchWordParam));
    }
}
