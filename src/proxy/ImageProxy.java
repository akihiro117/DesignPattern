package proxy;

import java.util.Map;

public class ImageProxy implements ImageInterface {
    private Map<Integer, String> imageCache;

    private Image image;

    public ImageProxy() {
        image = new Image();
        imageCache = image.getAllImage();
    }

    @Override
    public String getImage(Integer id) {
        return imageCache.get(id);
    }

    @Override
    public void saveImage(Integer id, String image) {
        System.out.println("id" + id + "の画像を保存します。");
        this.image.saveImage(id, image);
        refresh();
    }
    
    private void refresh() {
        imageCache = image.getAllImage();
    }
}
