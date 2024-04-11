import java.util.*; 
public class shoppingCart{
  ArrayList<product> products= new ArrayList<product>();
  double productCost;
  double totalCost;
  String product;
  int quantity;
  public shoppingCart(String product, double productCost, int quantity){
    this.product=product;
    this.productCost=productCost;
    this.quantity=quantity;
  }

  public void calculateTotal(){

  }
    
  public static void main(String[] args) {
  } 
}
