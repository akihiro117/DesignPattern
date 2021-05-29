package abstractfactory.imgfactory;

import abstractfactory.factory.Content;
import abstractfactory.factory.Writer;

public class ImgWriter extends Writer {
    private final Content img;

    public ImgWriter(Content img) {
        this.img = img;
    }

    @Override
    public void write() {
        System.out.println("画像情報を出力します。");
        img.out();
    }
    
}
