package abstractfactory.videofactory;

import abstractfactory.factory.Content;
import abstractfactory.factory.Writer;

public class VideoWriter extends Writer {
    private final Content video;

    public VideoWriter(Content video) {
        this.video = video;
    }

    @Override
    public void write() {
        System.out.println("動画情報を出力します。");
        video.out();
    }
}
