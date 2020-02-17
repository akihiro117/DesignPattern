package iterator;

public class Main {

    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        restaurant.setName("The Counter");
        restaurant.setGenre("ハンバーガー");
        restaurant.setLocation("六本木");

        RestaurantList restaurantList = new RestaurantList();
        restaurantList.addRestaurant(restaurant);

        Iterator restaurantIterator = restaurantList.createIterator();
        while (restaurantIterator.hasNext()) {
            System.out.println(restaurantIterator.next().toString());
        }
    }

}
