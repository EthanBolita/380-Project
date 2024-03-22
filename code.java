class Test {
   public static void main(String[] args) {
    System.out.println("Hello World");
   } 
    
}
public class shoppingCart{
   string product;
   double productCost;
   int quantity;
   public shoppingCart(String product, double productCost, int quantity){
this.product=product;
this.productCost=product;
this.quantity=quantity;
   }
}
private class creditCard{
   string customerName;
   string cardNumber;
   int CCV;
   string expDate;
   string address;
   string email;


  /*setEmail;
   setAddress;
   setName;
   setCarrinfo;*/
}

public class manager{
   //inventory;
   string managerName;
   string managerAddress;
   string login;
   string password;


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
   string nameOfShirt = "100% cotton shirts";
   string nameOfSweats ="Cargo Sewatpants";
   string nameOfSweater = "Thick cotton hoodie";

}
   
   

public class inventory{
  public static void main(String[] args) {
   int a = numOfShirts;
   int b = numOfSweats;
   int c = numOfSweaters;
   System.out.println("The total number of products is " + Integer.sum(a, b, c)); 
  }
} 