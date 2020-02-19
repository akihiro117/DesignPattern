package iterator;

/**
 * レストランのリスト(配列)の繰り返し処理の役割を担うクラス。
 * @author Akihiro Yamada
 *
 */
public class RestaurantArrayIterator implements Iterator {
    private Restaurant[] restaurants;
    private int currentIndex;

    public RestaurantArrayIterator(Restaurant[] restaurants) {
        this.restaurants = restaurants;
    }

    /**
     * 次の要素が存在するか否かを返す。
     * @return 次の要素が存在するか否か。
     * 次の要素が存在する   -> true、
     * 次の要素が存在しない -> false。
     */
    @Override
    public boolean hasNext() {
        if (this.currentIndex > this.restaurants.length - 1 ||
                this.restaurants[this.currentIndex] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        if (this.currentIndex > this.restaurants.length - 1) {
            return null;
        }

        Restaurant restaurant = this.restaurants[this.currentIndex];
        this.currentIndex++;

        return restaurant;
    }

}
