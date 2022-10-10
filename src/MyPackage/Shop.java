package MyPackage;

public class Shop {
    private String ShopName;
    private String ShopCategory;
    private int ShopId;
    private int ClientNumber;

    public String getName(){
        return ShopName;
    }

    public void setName(String shopName){
        this.ShopName = shopName;
    }

    public String getCategory(){
        return ShopCategory;
    }

    public void setCategory(String shopCategory){
        this.ShopCategory = shopCategory;
    }

    public int getId(){
        return ShopId;
    }

    public void setId(int shopId){
        this.ShopId = shopId;
    }

    public int getClientNumber(){
        return ClientNumber;
    }

    public void setClientNumber(int clientNumber){
        this.ClientNumber = clientNumber;
    }
}
