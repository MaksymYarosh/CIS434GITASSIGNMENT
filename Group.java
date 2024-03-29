public class group{
  public void printingName(){
    return "Manikdeep Kaur LNU";
  }
   public void printName(){
    return "Maksym Yarosh";
  }
  public void getGroupMembers(){
    printingName();
    printName();
  }
  public int division(int num1, int num2){
    int x = num1/num2;
    if(num2 == 0 || num1 % num2 ==0 )
      throw new ArithmeticException;
    return x;
  }
    
      
}
