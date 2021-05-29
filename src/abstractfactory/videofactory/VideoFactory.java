package abstractfactory.videofactory;

import abstractfactory.factory.Content;
import abstractfactory.factory.Factory;
import abstractfactory.factory.Writer;

public class VideoFactory extends Factory {

    @Override
    public Content createContent() {
        System.out.println("動画を作成します。");
        return new Video("動画", 30, 3_000);
    }

    @Override
    public Writer createWriter(Content content) {
        System.out.println("動画Writerを作成します。");
        return new VideoWriter(content);
    }
    
}
