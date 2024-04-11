import java.util.Scanner;

public class search{
    String size;
    String style;
    String color;

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

    public static void splitString(String input, search tem){
        String [] words=input.split(" ");
        for(String word : words){
            if(word.compareTo("red")==0){
                tem.setColor(word);
            }else if(word.compareTo("gray")==0){
                tem.setColor(word);
            }else if(word.compareTo("black")==0){
                tem.setColor(word);
            }else if(word.compareTo("small")==0){
                tem.setSize(word);
            }else if(word.compareTo("medium")==0){
                tem.setSize(word);
            }else if(word.compareTo("large")==0){
                tem.setSize(word);
            }else if(word.compareTo("sweater")==0){
                tem.setStyle(word);
            }else if(word.compareTo("pants")==0){
                tem.setStyle(word);
            }else if(word.compareTo("shirt")==0){
                tem.setStyle(word);
            }
        }
    }

    public static void main(String[] args) {
        search temp=new search("1","2","3");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
        String input=sc.nextLine();
        splitString(input, temp);
        System.out.println(temp.getSize()+temp.getColor()+temp.getStyle());
    }
}
