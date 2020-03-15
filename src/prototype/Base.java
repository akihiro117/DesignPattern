package prototype;

/**
 * clone を行いたいクラスが実装するインターフェース。
 */
interface Base extends Cloneable {
    abstract void showMsg();

    abstract void setMsg(String msg);

    abstract Base generateClone();
}