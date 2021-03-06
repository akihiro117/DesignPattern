package iterator;

import java.util.Arrays;

/**
 * レストランのリスト(配列)を扱うクラス。
 * 繰り返し処理以外の責務を負う。
 * @author Akihiro Yamada
 *
 */
public class RestaurantArray implements Aggregate {
    // 配列の要素数を超える場合に、一度に増加させる要素数。
    private static final int INCREMENTAL_NUM = 5;

    private Restaurant[] restaurantArray;

    private int numRestaurants;

    public RestaurantArray(int arrayLength) {
        this.restaurantArray = new Restaurant[arrayLength];
        this.numRestaurants = 0;
    }

    public void addRestaurant(Restaurant restaurant) {
        if (this.numRestaurants == this.restaurantArray.length) {
            // 最大要素まで値が入っている場合。

            Restaurant[] newRestaurantArray = Arrays.copyOf(
                    this.restaurantArray,
                    this.restaurantArray.length + INCREMENTAL_NUM);
            this.restaurantArray = newRestaurantArray;
        }

        this.restaurantArray[this.numRestaurants] = restaurant;
        this.numRestaurants++;
    }

    @Override
    public Iterator createIterator() {
        return new RestaurantArrayIterator(restaurantArray);
    }

}
