package decorator;

public class DownloadUser extends ImgDownLoadInfo {

    public DownloadUser(Download download) {
        super(download);
    }

    @Override
    public void download() {
        download.download();
        System.out.println("ダウンロードしたユーザーはhogeです。");
    }
    
}
