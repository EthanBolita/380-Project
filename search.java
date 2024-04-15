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

    public void splitString(String input){
        String [] words=input.split(" ");
        for(String word : words){
            if(word.compareTo("red")==0){
                color=word;
            }else if(word.compareTo("gray")==0||word.compareTo("grey")==0){
                if(word.compareTo("grey")==0){
                    word="gray";
                }
                color=word;
            }else if(word.compareTo("black")==0){
                color=word;
            }else if(word.compareTo("small")==0){
                size=word;
            }else if(word.compareTo("medium")==0){
                size=word;
            }else if(word.compareTo("large")==0){
                size=word;
            }else if(word.compareTo("sweater")==0){
                style=word;
            }else if(word.compareTo("pants")==0){
                style=word;
            }else if(word.compareTo("shirt")==0){
                style=word;
            }
        }
    }

    public String toString(){
        String value="";
        if(size.equals("small")==true||size.equals("medium")==true||size.equals("large")==true){
            value+=size+" ";
        }
        if(color.equals("red")==true||color.equals("gray")==true||color.equals("black")==true){
            value+=color+" ";
        }
        if(style.equals("shirt")==true||style.equals("sweater")==true||style.equals("pants")==true){
            value+=style+" ";
        }
        return value;
    }

    public static void main(String[] args) {
        search temp=new search("1","2","3");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
        String input=sc.nextLine();
        input=input.toLowerCase();
        temp.splitString(input);
        //System.out.println(temp.getSize()+" "+temp.getColor()+" "+temp.getStyle()+" ");
        System.out.println(temp.toString());
    }
}
