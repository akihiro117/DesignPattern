package proxy;

public class Main {
    public static void main(String[] args) {
        ImageInterface imageProxy = new ImageProxy();
        printImage(imageProxy);
        imageProxy.saveImage(4, "画像4");
        printImage(imageProxy);
    }

    private static void printImage(ImageInterface image) {
        int id = 1;
        while (image.getImage(id) != null) {
            System.out.println(image.getImage(id));
            id++;
        }
    }
}
