import java.util.*; 
public class shoppingCart{
  ArrayList<product> products= new ArrayList<product>();
  double totalCost=0;
  //String product;
  //int quantity;
  public shoppingCart(){
    //this.product=product;
    //this.productCost=productCost;
    //this.quantity=quantity;
  }


  public void addToCart(product item){
    products.add(item);
    totalCost+=item.getPrice();
  }

  public void remove(product item){
    for(int i=0; i<products.size();i++){
      if(products.get(i).getId()==item.getId()){
        products.remove(i);
        totalCost-=item.getPrice();
      }
    }
  }

  public double getTotal(){
      return totalCost;
  }

    
  public static void main(String[] args) {
    shoppingCart temp=new shoppingCart();
    product item=new product(0,"red",19.99, "small", "shirt");
    product item2=new product(0,"black",24.99, "small", "pants");
    temp.addToCart(item);
    temp.addToCart(item2);
    System.out.println(temp.getTotal());
    temp.remove(item);
    System.out.println(temp.getTotal());
  } 
}
