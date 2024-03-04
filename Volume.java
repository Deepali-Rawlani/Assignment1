class Room{
    float height;
    float width;
    float breadth;
    
public Room(float h,float w,float h){
    height=h;
    width=w;
    breadth=b;
}
 float volume(){
    return height*width*breadth;
   }
public static void main(String args[]){
      Room r=new Room(1.0,2.0,2.0);
       r.volume();
      Room r1=new Room(1.2,1.4,1.3);
 float vol;
     vol=r.volume();
   System.out.println("Volume is:"+vol);
    vol=r1.volume();
   System.out.println("Volume1 is:"+vol);
   }
}
 
      
    