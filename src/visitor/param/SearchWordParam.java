package visitor.param;

public class SearchWordParam implements VisitorParam {
    private String searchWord;

    public SearchWordParam(String searchWord) {
        this.searchWord = searchWord;
    }

    public String getSearchWord() {
        return searchWord;
    }

    public void setSearchWord(String searchWord) {
        this.searchWord = searchWord;
    }
}
