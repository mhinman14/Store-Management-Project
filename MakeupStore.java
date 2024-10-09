public class MakeupStore{
    private String brand;
    private double price;
    private int inventory;

  
  public MakeupStore(){
    this.brand = "";
    this.price = 0.0;
    this.inventory = 0;
  }


  public MakeupStore(String brand, double price, int inventory){
    this.brand = brand;
    this.price = price;
    this.inventory = inventory;
  }

  public String getBrand(){
    return brand;
  }

  public double getPrice(){
    return price;
  }

  public int getInventory(){
    return inventory;
  }

  public void setBrand(String brand){
    this.brand = brand;
  }

  public void setPrice(double price){
    this.price = price;
  }

  public void setInventory(int inventory){
    this.inventory = inventory;
  }

  public String toString() {
    String text = "Brand: " + brand + ", Price:" + price + ", Inventory:" + inventory;
    return text;
  }
}