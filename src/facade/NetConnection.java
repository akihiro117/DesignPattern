package facade;

public class NetConnection {
    public static void connect() {
        System.out.println("コネクションを確立します。");
    }

    public static void close() {
        System.out.println("コネクションを閉じます。");
    }
}
