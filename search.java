public class search{
    String size;
    String style;
    String color;
    String input;

    public search(String size, String style, String color){
        this.size=size;
        this.style=style;
        this.color=color;
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


    public void setSize(String size){
        this.size=size;
    }
    public void setStyle(String style){
        this.style=style;
    }
    public void setColor(String color){
        this.color=color;
    }

}
