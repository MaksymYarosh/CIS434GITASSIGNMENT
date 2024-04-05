import java.util.*;

public class Group{
  
  public String printingName(){
    return "Manikdeep Kaur LNU";
  }
   public String printName(){
    return "Maksym Yarosh";
  }
  public String printedName(){
    return "Malik Jamal";
  }
  
 public ArrayList<String> getGroupMembers() {
        ArrayList<String> members = new ArrayList<>();
        members.add(printingName());
        members.add(printName());
        members.add(printedName());
        return members;
    }
  
  public int division(int num1, int num2){

    if(num2 == 0 )
      throw new ArithmeticException("The division is invalid");

    int q=0;
    while(num1>num2){
      num1 -= num2;
      q++;
    }
    return q;
  }
  public int multiply(int num1, int num2) {
        if (num1 == 0 || num2 == 0) {
            return 0;
        }

        boolean isNegative = (num1 < 0) ^ (num2 < 0);
        num1 = Math.abs(num1);
        num2 = Math.abs(num2);

        int product = 0;
        for (int i = 0; i < num2; i++) {
            product += num1;
        }
        return isNegative ? -product : product;
    }
  public int power(int num1, int num2){
        return Math.pow(num1, num2);
    }
    
      
}
