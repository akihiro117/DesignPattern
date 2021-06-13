package decorator;

public class Main {
    public static void main(String[] args) {
        Download download = new ImgDownload("画像をダウンロードします。");
        Download download2 = new DownloadTime(download);
        Download download3 = new DownloadUser(download2);
        Download download4 = new DownloadUser(download);
        Download download5 = new DownloadTime(download4);

        download.download();
        download2.download();
        download3.download();
        download4.download();
        download5.download();
    }    
}
