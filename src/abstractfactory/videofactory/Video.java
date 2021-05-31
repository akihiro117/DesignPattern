package abstractfactory.videofactory;

import abstractfactory.factory.Content;

public class Video extends Content {
    private final int playTime;

    private final int dataSize;

    public Video(String title, int playTime, int dataSize) {
        super(title);
        this.playTime = playTime;
        this.dataSize = dataSize;
    }

    public int getPlayTime() {
        return playTime;
    }

    public int getDataSize() {
        return dataSize;
    }

    public void out() {
        System.out.printf("タイトル: %s\n", getTitle());
        System.out.printf("再生時間(分): %d\n", playTime);
        System.out.printf("データサイズ: %d\n", dataSize);
    }
}
