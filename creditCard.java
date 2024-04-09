private class creditCard{
   String customerName;
   String cardNumber;
   String CCV;
   int month;
   int year;
  
  public void verify(){
    if (cardNumber.matches ("[0-9]+") && cardNumber.length() == 11){
      cardNumber=cardNumber;
    }else{
      System.out.println("Invalid. Try again");
    }
    if (customerName.matches("[a-zA-Z]+")){
      customerName=customerName;
    }else{
      System.out.println("Invalid. Try again");
    }
    if (CCV.matches ("[0-9]+") && CCV.length() == 2){
      CCV=CCV;
    }else{
      System.out.println("Invalid. Try again");
    }
    if (month > 0 && month < 13){
      month=month;
    }else{
      System.out.println("Invalid. Try again");
    }
  }
}