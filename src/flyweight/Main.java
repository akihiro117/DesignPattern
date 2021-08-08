package flyweight;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        VideoFactory videoFactory = VideoFactory.getInstance();
        IntStream.rangeClosed(0, 10).forEach((i) -> videoFactory.obtainVideo(i));
        IntStream.rangeClosed(0, 10).forEach((i) -> videoFactory.obtainVideo(i));
    }
}
