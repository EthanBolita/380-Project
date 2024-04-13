public class product{
   int id;
   String color;
   //int quanitiy;
   double price;
   String size;
   String type;

  public product(int id, String color, /*int quanitiy,*/ double price, String size, String type){
    this.id=id;
    this.color=color;
    //this.quantity=quantity;
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

  /*public int getQuanitiy(){
    return quanitiy;
  }*/

  public String getType(){
    return type;
  }

  public int getId(){
    return id;
  }

  public String getSize(){
    return size;
  }

}