package abstractfactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import abstractfactory.factory.Content;
import abstractfactory.factory.Factory;
import abstractfactory.factory.Writer;

public class Main {
    public static void main(String[] args) {
        List<String> classNameList = new ArrayList<>(Arrays.asList("abstractfactory.videofactory.VideoFactory", "abstractfactory.imgfactory.ImgFactory"));

        classNameList.stream().forEach(className -> {
            Factory factory = Factory.getFactory(className);
            Content content = factory.createContent();
            Writer writer = factory.createWriter(content);
            writer.write();
            System.out.println("------------------------------");
        });
    }    
}
