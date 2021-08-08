package flyweight;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class VideoFactory {
    private Map<Integer, Video> videoMap = new HashMap<>();

    private static VideoFactory singleton = new VideoFactory();

    private VideoFactory() {

    }

    public static VideoFactory getInstance() {
        return singleton;
    }

    public synchronized Video obtainVideo(Integer num) {
        System.out.println(num + "を取得します。");
        return Optional.ofNullable(videoMap.get(num)).orElseGet(() -> {
            System.out.println(num + "は未取得なのでインスタンス生成します。");
            videoMap.put(num, new Video("動画" + num));
            return videoMap.get(num);
        });
    }
}
