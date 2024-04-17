/**
 * This is the manager class, which stores the variables needed for the
 * manager, and allows the user to add and remove objects in the
 * inventory.
 * @ authors: Michael and Ethan
 * @ version: 6 
 */

import java.util.*;
public class manager{
   String managerName;
   String managerAddress;
   String login;
   String password;
   ArrayList<product> inventory= new ArrayList<product>();
   
   /**
    * manager class constructor: it takes in a name, address, login,
    * and password.
    */

   public manager(String name,String address, String login, String password){
      managerName=name;
      managerAddress=address;
      this.login=login;
      this.password=password;
   }
   
   /**
    * addToInventory method: it takes in a product and
    * adds it to the user's inventory.
    */

   public void addToInventory(product thing){
      inventory.add(thing);
   }

   /**
    * removeFromInventory method: it takes in a product
    * and removes it from the user's inventory.
    */

   public void removeFromInventory(product thing){
      for(int i=0; i<inventory.size();i++){
         if(inventory.get(i).getId()==thing.getId()){
            inventory.remove(i);
         }
      }
   }

   /**
    * listInventory method: it prints out the variables of the
    * products stored in the inventory.
    */

   public void listInventory(){
      for(int i=0; i<inventory.size();i++){
         System.out.println(inventory.get(i).toString());
      }
   }

   public static void main(String[] args){
      manager temp=new manager("Bob","12345mainStreet","bobhere","1234");
      product item=new product(0,"red",19.99, "small", "shirt");
      product item2=new product(1,"black",24.99, "small", "pants");
      temp.addToInventory(item);
      temp.addToInventory(item2);
      temp.listInventory();
      temp.removeFromInventory(item);
      temp.listInventory();
   }


}