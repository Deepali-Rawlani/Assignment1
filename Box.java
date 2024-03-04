class Box{
            double height;
            double width;
            double breadth;
Box(double h,double w,double b){
        height=h;
        width=w;
        breadth=b;
      }
double getVolume(){
        return height*width*breadth;
             }
double getArea(){
          return width*breadth;
            }
  public static void main(String args[]){
           Box b1=new Box(10.0,11.3,2.1);
           Box b2=new Box(11.0,8.6,2.3); 
     
            System.out.println("The volume of boxA is "+b1.getVolume());
            System.out.println("The Area of boxA is "+b1.getArea());
            System.out.println("The volume of boxAB is "+b2.getVolume());
           System.out.println("The Area of boxB is "+b2.getArea());
      

}
}
            