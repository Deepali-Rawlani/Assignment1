import java.util.Scanner;
 class Factorial{
 public static void main (String args[]){
      int i=1;
      int fact=1;
 Scanner sc= new Scanner(System.in);
    
   System.out.println("Enter the number for finding the factorial");
  int number=sc.nextInt();
       while(i<=number){
       fact=fact*i;
        i++;
       }
System.out.println("Factorial is:" +number+ "is" +fact );
}
}
