package MyPackage;

public class Main {
    public static void main(String[] args) {
        Shop model = retrieveShopFromDatabase();
        ShopView view = new ShopView();
        ShopController controller = new ShopController(model, view);

        controller.setClientNumber(6000);
        System.out.println("Updated Shop Client number");
        controller.updateView();

    }

    private static Shop retrieveShopFromDatabase(){
        Shop shop = new Shop();
        shop.setName("Zara");
        shop.setId(1);
        shop.setCategory("fashion");
        shop.setClientNumber(5000);
        return shop;
    }

}