/**
 * This is the product class, which stores the variables needed
 * for the products
 * @ authors: Michael
 * @ date of oldest edition: April 9
 * @ version: 5 
 */

public class product{
   int id;
   String color;
   double price;
   String size;
   String type;

  public product(int id, String color, double price, String size, String type){
    this.id=id;
    this.color=color;
    this.price=price;
    this.size=size;
    this.type=type;
  }
  
  public double getPrice(){
    return price;
  }

  public String getColor(){
    return color;
  }

  public String getType(){
    return type;
  }

  public int getId(){
    return id;
  }

  public String getSize(){
    return size;
  }

  public String toString(){
    String item="ID: "+id+" Style: "+type+" Color: "+color+" Size: "+size+" Price: "+price;
    return item;
  }

}