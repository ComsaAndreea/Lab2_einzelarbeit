package MyPackage;

import java.util.Scanner;

public class ShopView {
    public void printShopDetails(String ShopName, String ShopCategory, int ShopId, int ClientNumber){
        System.out.println("Shop Details: ");
        System.out.println("Name: " + ShopName);
        System.out.println("Category: " + ShopCategory);
        System.out.println("Shop ID: " + ShopId);
        System.out.println("Client Number: " + ClientNumber);
    }

    public Shop createShop(){
        Shop shop = new Shop();
        Scanner in = new Scanner(System.in);
        System.out.println("New Shop:");
        System.out.println("Name: ");
        System.out.println("Id: ");
        System.out.println("Category: ");
        System.out.println("Client Number: ");
        return shop;
        //mai trebuie sa fac citirea si sa adaug in main functionalitatea
    }

}
