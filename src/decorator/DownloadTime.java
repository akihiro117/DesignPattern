package decorator;

public class DownloadTime extends ImgDownLoadInfo {

    public DownloadTime(Download download) {
        super(download);
    }

    @Override
    public void download() {
        download.download();
        System.out.println(System.currentTimeMillis());
    }
    
}
