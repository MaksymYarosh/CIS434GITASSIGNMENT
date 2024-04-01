public class group{
  public void printingName(){
    return "Manikdeep Kaur LNU";
  }
   public void printName(){
    return "Maksym Yarosh";
  }
  public void printedName(){
    return "Malik Jamal";
  }
  
  public void getGroupMembers(){
    printingName();
    printName();
    printedName();
  }
  public int division(int num1, int num2){
    int x = num1/num2;
    if(num2 == 0 || num1 % num2 ==0 )
      throw new ArithmeticException;
    return x;
  }
  public int multiply(int num1, int num2){
        return num1 * num2;
    }
  public int power(int num1, int num2){
        return Math.pow(num1, num2);
    }
    
      
}
