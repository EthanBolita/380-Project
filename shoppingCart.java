class Test {
   public static void main(String[] args) {
    System.out.println("Hello World");
   } 
    
}
public class shoppingCart{
ArrayList<product> products= new ArrayList<product>();
   double productCost;
   double totalCost;
   public shoppingCart(String product, double productCost, int quantity){
this.product=product;
this.productCost=productCost;
this.quantity=quantity;
   }
}
private class creditCard{
   String customerName;
   String cardNumber;
   String CCV;
   int month;
   int year;
  
  if (cardNumber.matches ("[0-9]+") && cardNumber.length == 11){
    cardNumber=cardNumber;
  }else{
      System.out.println("Invalid. Try again");
  }
  if (customerName.matches("[a-zA-Z]+")){
  customerName=customerName;
  }else{
      System.out.println("Invalid. Try again");
  }
   if (CCV.matches ("[0-9]+") && CCV.length == 2){
  CCV=CCV;
  }else{
      System.out.println("Invalid. Try again");
  }
  if (month > 0 && month < 13){
      month=month;
      }else{
          System.out.println("Invalid. Try again");
      }
}

public class manager{
   String managerName;
   String managerAddress;
   String login;
   String password;
   myInventory=new Inventory();


}
public class product{
   int id;
   char color;
   int quanitiy;
   double price;
   char size;
   String type;
  
  public double getPrice(){
    return price;
  }

  public char getColor(){
    return color;
  }

  public int getQuanitiy(){
    return quanitiy;
  }

  public String getType(){
    return type;
  }

  public int getId(){
    return id;
  }

  public char getSize(){
    return size;
  }

}
   
   

public class Inventory{
 ArrayList<product> sweats= new ArrayList<product>();
 ArrayList<product> sweaters= new ArrayList<product>();
 ArrayList<product> shirts= new ArrayList<product>();
}
 
 
 
 
 
  public static void main(String[] args) {
   int a = numOfShirts;
   int b = numOfSweats;
   int c = numOfSweaters;
   System.out.println("The total number of products is " + Integer.sum(a, b, c)); 
  } 