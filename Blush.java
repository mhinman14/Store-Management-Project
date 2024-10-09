public class Blush extends MakeupStore {
  boolean isPowder;
  String color;

  public Blush() {
    super();
    this.isPowder = false;
    this.color = "default";
  }

  public Blush(String brand, double price, int inventory, boolean isPowder, String color) {
    super(brand, price, inventory);
    this.isPowder = isPowder;
    this.color = color;
  }

  public boolean getIsPowder() {
    return isPowder;
  }

  public String getColor() {
    return color;
  }

  public void setIsPowder(boolean isPowderUpdate) {
    isPowder = isPowderUpdate;
  }

  public void setColor (String colorUpdate) {
    color = colorUpdate;
  }

  public String toString() {
    String text = "Product: Blush\n";
    text+= super.toString();
    text += ", Powder?: " + isPowder;
    text+= ", Color: " + color;
    return text;
  }
}