package MyPackage;

public class ShopController {
    private Shop model;
    private ShopView view;

    public ShopController(Shop model, ShopView view){
        this.model = model;
        this.view = view;
    }

    public String getName(){
        return model.getName();
    }

    public void setName(String shopName){
        model.setName(shopName);
    }

    public String getCategory(){
        return model.getCategory();
    }

    public void setCategory(String shopCategory){
        model.setCategory(shopCategory);
    }

    public int getId(){
        return model.getId();
    }

    public void setId(int shopId){
        model.setId(shopId);
    }

    public int getClientNumber(){
        return model.getClientNumber();
    }

    public void setClientNumber(int clientNumber){
        model.setClientNumber(clientNumber);
    }

    public void updateView(){
        view.printShopDetails(model.getName(), model.getCategory(), model.getId(),model.getClientNumber());
    }
}
