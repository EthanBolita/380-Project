class Test {
   public static void main(String[] args) {
    System.out.println("Hello World");
   } 
    
}
public class shoppingCart{
   String product;
   double productCost;
   int quantity;
   public shoppingCart(String product, double productCost, int quantity){
this.product=product;
this.productCost=productCost;
this.quantity=quantity;
   }
}
private class creditCard{
   String customerName;
   String cardNumber;
   int CCV;
   String expDate;
   String address;
   String email;


  /*setEmail;
   setAddress;
   setName;
   setCarrinfo;*/
}

public class manager{
   //inventory;
   String managerName;
   String managerAddress;
   String login;
   String password;


}
public class product{
   char shirtColor;
   char sweatsColor;
   char sweaterColor;
   static int numOfShirts;
   static int numOfSweats;
   static int numOfSweaters;
   double priceOfShirt;
   double priceOfSweats;
   double priceOfSweater;
   String nameOfShirt = "100% cotton shirts";
   String nameOfSweats ="Cargo Sewatpants";
   String nameOfSweater = "Thick cotton hoodie";

}
   
   

public class inventory{
  public static void main(String[] args) {
   int a = numOfShirts;
   int b = numOfSweats;
   int c = numOfSweaters;
   System.out.println("The total number of products is " + Integer.sum(a, b, c)); 
  }
} 