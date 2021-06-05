package composite;

import composite.exception.TagGrammarException;

public abstract class Tag {    
    public abstract void write();

    public abstract String getName();

    public void add(Tag tag) {
        throw new TagGrammarException("許可されていないメソッドが呼ばれました。");
    }
}
