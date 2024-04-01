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

    if(num2 == 0 || num1 % num2 !==0 )
      throw new ArithmeticException("The division is invalid");

    int q=0;
    while(num1>num2){
      num1 -= num2;
      q++;
    }
    return q;
  }
  public int multiply(int num1, int num2){
        return num1 * num2;
    }
  public int power(int num1, int num2){
        return Math.pow(num1, num2);
    }
    
      
}
