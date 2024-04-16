import java.util.*; 
public class shoppingCart{
  ArrayList<product> products= new ArrayList<product>();
  double totalCost=0;

  public void addToCart(product item){
    products.add(item);
    totalCost+=item.getPrice();
  }

  public void remove(product item){
    for(int i=0; i<products.size();i++){
      if(products.get(i).getId()==item.getId()){
        totalCost-=products.get(i).getPrice();
        products.remove(i);
        totalCost= (double) Math.round(totalCost * 100) / 100;
      }
    }
  }

  public double getTotal(){
    return totalCost;
  }

  public String printContent(){
    String value="";
    for(int i=0; i<products.size();i++){
      value+=products.get(i).toString();
      if(i!=products.size()-1){
        value+="\n";
      }
    }
    return value;
  }

    
  public static void main(String[] args) {
    shoppingCart temp=new shoppingCart();
    product item=new product(0,"red",19.99, "small", "shirt");
    product item2=new product(1,"black",24.99, "small", "pants");
    temp.addToCart(item);
    temp.addToCart(item2);
    System.out.println(temp.getTotal());
    System.out.println(temp.printContent());
    temp.remove(item);
    System.out.println(temp.getTotal());
  } 
}
