public class shoppingCart{
  ArrayList<product> products= new ArrayList<product>();
  double productCost;
  double totalCost;
  public shoppingCart(String product, double productCost, int quantity){
    this.product=product;
    this.productCost=productCost;
    this.quantity=quantity;
  }
  public static void main(String[] args) {
  } 
}