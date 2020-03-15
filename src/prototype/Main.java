package prototype;

class Main {
    public static void main(String[] args) {
        Base curry = new Food("このインタンスにはカレーのデータが入っています。よろしくお願いします。", "カレー", 200, "東京都");
        Base hamburger = new Food("このインタンスにはハンバーガーのデータが入っています。よろしくお願いします。", "ハンバーガー", 300, "東京都");

        // 何度もインスタンスを生成するのは面倒くさいので、後で clone できるように generator に登録しておく。
        InstanceGenerator instanceGenerator = new InstanceGenerator();
        instanceGenerator.registerInstance("カレー", curry);
        instanceGenerator.registerInstance("ハンバーガー", hamburger);

        Base curry2 = instanceGenerator.generateClone("カレー");
        curry2.showMsg();
        Base hamburger2 = instanceGenerator.generateClone("ハンバーガー");
        Base hamburger3 = instanceGenerator.generateClone("ハンバーガー");
        hamburger2.showMsg();
        hamburger2.setMsg("僕の好物です。");
        hamburger2.showMsg();

        // 元となったインスタンスの値が変わっているか確認。
        // 実行結果 -> 変わっていない。
        hamburger.showMsg();
        // 他の clone の値が変わっているか確認。
        // 実行結果 -> 変わっていない。
        hamburger3.showMsg();

        // 後から生成した clone の値に反映されているか確認。
        // 実行結果 -> 反映されない。
        Base hamburger4 = instanceGenerator.generateClone("ハンバーガー");
        hamburger4.showMsg();
    }
}