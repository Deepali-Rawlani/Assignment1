class Person{
  int age =20;
  float height=5.3f;
  float weight=56.2f;
 Person(){
     age =10;
   height=5.1f;
   weight=55.2f;
        
         } 
Person(int a,float h,float w){
      age=a;
      height=h; 
      weight=w;
      }
int display(){
    System.out.println("THE AGE IS:"+age);
    System.out.println("THE HEIGHT IS:"+height);
    System.out.println("THE WEIGHT IS:"+weight);
        return 0;
        }
public static void main(String args[]){
     Person p1 = new Person();
     Person p2=new Person(23,5.4f,57.4f);
         p1.display();
         p2.display();
    
}
}


     