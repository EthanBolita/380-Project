/**
 * This is the customer class, which stores the variables needed for
 * the customer, like: name, address, etc.
 * @ authors: Michael and Ethan
 * @ version: 5 
 */

public class cutomer{
    String name;
    String address;
    String card;
    String email;
    shoppingCart myShoppingCart= new shoppingCart();

    public void setName(String name){
        this.name=name;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public void setCard(String card){
        this.card=card;
    }
    public void setEmail(String email){
        this.email=email;
    }



    public static void main(String[] args){
    
    }

}
