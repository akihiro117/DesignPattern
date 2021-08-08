package proxy;

import java.util.HashMap;
import java.util.Map;

public class Image implements ImageInterface {
    private Map<Integer, String> image = new HashMap<>();

    public Image() {
        image.put(1, "画像1");
        image.put(2, "画像2");
        image.put(3, "画像3");
    }

    @Override
    public String getImage(Integer id) {
        System.out.println("サーバーからid" + id + "の画像を取得します。");
        return image.get(id);
    }

    @Override
    public void saveImage(Integer id, String image) {
        System.out.println("サーバーにid" + id + "の画像を保存します。");
        this.image.put(id, image);
    }
    
    public Map<Integer, String> getAllImage() {
        return image;
    }
}
