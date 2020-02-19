package iterator;

public class Main {

    public static void main(String[] args) {
        Restaurant humbergerRestaurant = new Restaurant();
        humbergerRestaurant.setName("The Counter");
        humbergerRestaurant.setGenre("ハンバーガー");
        humbergerRestaurant.setLocation("六本木");

        RestaurantList restaurantList = new RestaurantList();
        restaurantList.addRestaurant(humbergerRestaurant);

        Iterator restaurantListIterator = restaurantList.createIterator();
        printRestaurant(restaurantListIterator);

        Restaurant curryRestaurant = new Restaurant();
        curryRestaurant.setName("オードリー");
        curryRestaurant.setGenre("カレー");
        curryRestaurant.setLocation("神保町");

        RestaurantArray restaurantArray = new RestaurantArray(0);
        restaurantArray.addRestaurant(curryRestaurant);

        Iterator restaurantArrayIterator = restaurantArray.createIterator();
        printRestaurant(restaurantArrayIterator);

    }

    public static void printRestaurant(Iterator restaurantIterator) {
        while (restaurantIterator.hasNext()) {
            System.out.println(restaurantIterator.next().toString());
        }
    }
}
