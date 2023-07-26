  /*
	Instance & Static:
	- Declared at class-level 
	- Scope: Entire class
	- Gets default value
	- Cannot be re-initialized directly within class

	Instance: Represents object state

	- Values are unique to object
	- From outside class: Accessible via object reference

	Static:
	 
	- Values are unique to class ~ One copy per class (shared across objects)
	- From outside class: Accessible via Class Name or object reference

	Instance & static variables are also referred to as fields or attributes. Attributes is probably more commonly associated with instance variables. 
*/
  
  class Student {
      static int computeCount;
	  
      int id;
	  String name;
	  String gender;
	  int age;
	  long phone;	  
	  double gpa;	  
	  char degree;
	  
	  boolean international;
	  double tuitionFees = 12000.0;
	  double internationalFees = 5000.0;
	
	  void compute() {	
   	      computeCount = computeCount + 1;
		  int nextId = id + 1;		  
		  
		  if (international) {
		      tuitionFees = tuitionFees + internationalFees;
		  }
		
	      System.out.println("\nid: " + id);
		  System.out.println("nextId: " + nextId);
		  System.out.println("name: " + name);
		  System.out.println("gender: " + gender);
		  System.out.println("age: " + age);
		  System.out.println("phone: " + phone);
		  System.out.println("gpa: " + gpa);
		  System.out.println("degree: " + degree);
		  System.out.println("tuitionFees: " + tuitionFees);
		  System.out.println("computeCount: " + computeCount);
	  }
	  
	
	  public static void main(String[] args) {
	      Student student1 = new Student();
		  student1.id = 1000;	
	      student1.name = "John";
	      student1.gender = "male";
	      student1.age = 18;
	      student1.phone = 223_456_7890L;	  
	      student1.gpa = 3.8;	  
	      student1.degree = 'B';	  
	      student1.international = false;
		  student1.compute();
		  
		  Student student2 = new Student();
		  student2.id = 1001;	
	      student2.name = "Raj";
	      student2.gender = "male";
	      student2.age = 21;
	      student2.phone = 223_456_9999L;	  
	      student2.gpa = 3.4;	  
	      student2.degree = 'M';	  
	      student2.international = true;
		  student2.compute();
		  
		  Student student3 = new Student();
		  student3.id = 1002;
		  student3.name = "Anita";
		  student3.gender = "female";
		  student3.age = 20;
		  student3.phone = 223_456_8888L;
		  student3.gpa = 4.0;
		  student3.degree = 'M';
		  student3.international = true;
		  student3.compute();
		  
		  System.out.println("Student.computeCount: " + Student.computeCount);
	  }
  }