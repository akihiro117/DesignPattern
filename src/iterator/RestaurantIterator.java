package iterator;

import java.util.List;

/**
 * レストランのリストの繰り返し処理の役割を担うクラス。
 * @author Akihiro Yamada
 *
 */
public class RestaurantIterator implements Iterator {
    private List<Restaurant> restaurants;
    private int currentIndex;

    public RestaurantIterator(List<Restaurant> restaurants) {
        this.restaurants = restaurants;
    }

    /**
     * 次の要素が存在するか否かを返す。
     * @return 次の要素が存在するか否か。
     * 次の要素が存在する   -> true、
     * 次の要素が存在しない -> false。
     */
    public boolean hasNext() {
        if (this.currentIndex > restaurants.size() - 1
                || restaurants.get(this.currentIndex) == null) {
            // restaurants のサイズの初期値を大きめに設定している場合があるかもしれないため、
            // null チェックも行う。

            return false;
        } else {
            return true;
        }
    }

    /**
     * 現在の要素を返すと同時に、リストのインデックスを一つ進める。
     * @return 現在の要素。
     */
    public Restaurant next() {
        Restaurant currentRestaurant = restaurants.get(this.currentIndex);
        this.currentIndex++;

        return currentRestaurant;
    }
}
