package abstractfactory.imgfactory;

import abstractfactory.factory.Content;
import abstractfactory.factory.Factory;
import abstractfactory.factory.Writer;

public class ImgFactory extends Factory {

    @Override
    public Content createContent() {
        System.out.println("画像を作成します。");
        return new Img("画像", 150, 200, 300);
    }

    @Override
    public Writer createWriter(Content content) {
        System.out.println("画像Writerを作成します。");
        return new ImgWriter(content);
    }
    
}
