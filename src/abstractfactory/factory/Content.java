package abstractfactory.factory;

public abstract class Content {
    private final String title;

    public Content(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public abstract void out();
}
