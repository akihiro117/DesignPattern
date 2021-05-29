package abstractfactory.factory;

import java.lang.reflect.InvocationTargetException;

public abstract class Factory {
    public static Factory getFactory(String className) {
        try {
            return (Factory) Class.forName(className).getDeclaredConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
                | NoSuchMethodException | SecurityException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public abstract Content createContent();
    public abstract Writer createWriter(Content content);
}
