/**
 * This is the creditCard class, which takes in a user's
 * credit card information, and verifies if the information
 * is acceptable for a credit card.
 * @ authors: Ethan
 * @ version: 5 
 */

private class creditCard{
  String customerName;
  String cardNumber;
  String CCV;
  int month;
  int year;
  int age;
  
  /**
   * verify method: it takes in user input and checks to see
   * if the card number has the correct number of digits,
   * if the customer name matches the account,
   * and the ccv number has the correct number of digits.
   * If it does, then the EmailSystem class will be called;
   * otherwise the method will return with an error message.
   */

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