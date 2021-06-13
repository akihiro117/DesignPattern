package decorator;

public class ImgDownload extends Download {
    private String msg;

    public ImgDownload(String msg) {
        this.msg = msg;
    }

    @Override
    public void download() {
        System.out.println(msg);
    }
    
}
