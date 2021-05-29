package abstractfactory.imgfactory;

import abstractfactory.factory.Content;

public class Img extends Content {
    private final int dataSize;

    private final int width;

    private final int height;

    public Img(String title, int dataSize, int width, int height) {
        super(title);
        this.dataSize = dataSize;
        this.width = width;
        this.height = height;
    }

    @Override
    public void out() {
        System.out.printf("タイトル: %s\n", getTitle());
        System.out.printf("幅(px): %d\n", width);
        System.out.printf("高さ(px): %d\n", height);
        System.out.printf("データサイズ: %d\n", dataSize);
    }
    
}
