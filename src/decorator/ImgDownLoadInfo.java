package decorator;

public abstract class ImgDownLoadInfo extends Download {
    protected Download download;

    public ImgDownLoadInfo(Download download) {
        this.download = download;
    }
}
