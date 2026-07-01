package ProductInventory;

class Product{
    private String productId;
    private String productName;
    private double price;
    private int quantity;

    public Product(){}

    public Product(String productId, String productName, double price, int quantity){
        this.productId = productId;
        this.productName = productName;

        this.price = price < 0 ? 0.0 : price;
        this.quantity = quantity < 0 ? 0 : quantity;
    }

    public void setProductName(String productName){ this.productName = productName;}
    public void setPrice(double price){ this.price = price < 0 ? 0.0 : price;}
    public void setQuantity(int quantity){ this.quantity = quantity < 0 ? 0 : quantity;}

    public String getProductId(){
        return this.productId;
    }
    public String getProductName(){ return this.productName;}
    public double getPrice(){ return this.price;}
    public int getQuantity(){ return this.quantity;}

    @Override
    public String toString(){
        return "Id: " + this.productId + ", Name: " + this.productName + ", Price: " + this.price + ", Quantity: " + this.quantity;
    }
}