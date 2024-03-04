//day3 assignment
import java.util.Scanner;
     class Sum{
        public static void main(String args[]){
           Scanner sc=new Scanner(System.in);
           System.out.println("enter a number to sum");

               int num=sc.nextInt();
               int sum=0;
                   do{
                       sum=sum+ num%10;
                        num=num/10;
                   
                      }while(num>0);
          System.out.println(sum);
}
}
                      
                  
                    