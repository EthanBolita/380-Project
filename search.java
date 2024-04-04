public class search{
    int  productID;
    String size;
    String style;
    String color;
    double price;


    public search(int  productID, String size, String style, String color, double price ){
        this.productID= productID;
        this.size=size;
        this.style=style;
        this.color=color;
        this.price=price;
    }
    public int getProductID(){
        return productID;
    }
    public String getSize(){
        return size;
    }

    public String getStyle(){
        return style;
    }

    public String getColor(){
        return color;
    }

    public double getPrice(){
        return price;
    }

    public void setProductID(int productID){
        this.productID=productID;
    }
    public void setSize(String size){
        this.size=size;
    }
    public void setStyle(String style){
        this.style=style;
    }
    public void setColor(String color){
        this.color=color:
    }
    public void setPrice(double price){
        this.price=price;
    }

}
