package visitor;

import visitor.contents.Directory;
import visitor.contents.File;
import visitor.param.SearchWordParam;
import visitor.visitor.DisplayVisitor;
import visitor.visitor.SearchWordVisitor;

public class Main {
    public static void main(String[] args) {
        SearchWordParam searchWordParam = new SearchWordParam("Hello world!");
        System.out.println(searchWordParam.getSearchWord() + "の検索を開始します...");
        Directory directory1 = new Directory("ディレクトリ1");
        File file1 = new File("ファイル1.txt");
        File file2 = new File("ファイル2.csv");
        directory1.addContents(file1, file2);
        Directory directory2 = new Directory("ディレクトリ2");
        File file3 = new File("ファイル3.log");
        directory2.addContents(file3, directory1);
        // visitorを入れ替えるだけで簡単に処理を切り替えられる。
        // 新しい処理を追加する時はvisitorを新たに追加するだけで良い。
        directory2.accept(new SearchWordVisitor(), searchWordParam);
        directory2.accept(new DisplayVisitor(), null);
    }    
}
