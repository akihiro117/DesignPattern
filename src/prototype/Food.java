package prototype;

/**
 * clone するメソッドを実装するクラス。 clone されるクラス。
 */
class Food implements Base {
    private String msg;
    private String name;
    private int weight;
    private String producingArea;

    public Food(String msg, String name, int weight, String producingArea) {
        this.msg = msg;
        this.name = name;
        this.weight = weight;
        this.producingArea = producingArea;
    }

    public void showMsg() {
        System.out.println(this.msg);
    }

    public Base generateClone() {
        try {
            return (Base) clone();
        } catch (CloneNotSupportedException e) {
            // 検査例外。

            e.printStackTrace();
            return null;
        }
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Food [msg=" + msg + ", name=" + name + ", producingArea=" + producingArea + ", weight=" + weight + "]";
    }
}