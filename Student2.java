class Student2{
        String name = "Deepali";
	int m1 = 67;
	int m2 = 89;
	int m3= 78;
	//int total

	int sum(){
		return m1+m2+m3;
	       }

	int total = sum();

	float average(){
		return total/3;
	     }

	public static void main(String[] args){
		Student2 s = new Student2();
		System.out.println("Name of student : " +s.name);
		System.out.println("Total marks : " +s.total);
		System.out.println("Average : "  +s.average());
	}
}
          