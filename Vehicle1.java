class Vehicle1{

          int price;
          String color;
          String model;
 Vehicle1(int  p,String c,String m){
         price=p;
         color=c;
         model=m;
         }
 int display(){
      System.out.println("THE price of CAR Is:" +price);
      System.out.println("THE color of CAR Is:" +color );
           System.out.println("THE model  of CAR Is:" +model  );
            return 0;
          }
public static void main(String args[]){
        Vehicle1 v1 = new Vehicle1 (2000,"BLACK","HYUNDAI");
      System.out.println("Vehicle is");
         v1.Vehicle1 (display());


}
}


      