package iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * レストランのリストを扱うクラス。
 * 繰り返し処理以外の責務を負う。
 * @author Akihiro Yamada
 *
 */
public class RestaurantList implements Aggregate {
    private List<Restaurant> restaurantList;

    public RestaurantList() {
        this.restaurantList = new ArrayList<Restaurant>();
    }

    public void addRestaurant(Restaurant restaurant) {
        this.restaurantList.add(restaurant);
    }

    public Iterator createIterator() {
        return new RestaurantIterator(this.restaurantList);
    }
}
