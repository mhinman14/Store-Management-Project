public class Highlighter extends MakeupStore {
  boolean isLiquid;
  int volume;

  public Highlighter() {
    super();
    this.isLiquid = true;
    this.volume = 0;
  }

  public Highlighter(String brand, double price, int inventory, boolean isPowder, String color) {
    super(brand, price, inventory);
    this.isLiquid = isLiquid;
    this.volume = volume;
  }

  public boolean getIsLiquid() {
    return isLiquid;
  }

  public int getVolume() {
    return volume;
  }

  public void setIsLiquid(boolean isLiquid) {
    this.isLiquid = isLiquid;
  }

  public void setVolume(int volume) {
    this.volume = volume;
  }

  public String toString() {
    String text = "Product: Highlighter\n";
    text += "Brand: " + super.getBrand() + " Price: " + this.getPrice() + " Inventory: " + this.getInventory();
    text += ", Liquid?: " + isLiquid + ", Volume: " + volume;
    return text;
  }

}