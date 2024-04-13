import java.util.*;
public class manager{
   String managerName;
   String managerAddress;
   String login;
   String password;
   ArrayList<product> inventory= new ArrayList<product>();
   
public manager(String name,String address, String login, String password){
   managerName=name;
   managerAddress=address;
   this.login=login;
   this.password=password;
}
public void addToInventory(product thing){
   inventory.add(thing);
}

public void removeFromInventory(product thing){
   for(int i=0; i<inventory.size();i++){
      if(inventory.get(i).getId()==thing.getId()){
        inventory.remove(i);
      }
    }
}

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