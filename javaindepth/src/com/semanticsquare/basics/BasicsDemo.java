  import java.math.BigDecimal;
  
  class BasicsDemo {
      // Adapted from http://www.ntu.edu.sg/home/ehchua/programming/java/J1a_Introduction.html
      static void print() {
          System.out.println("\n\nInside print ...");
          System.out.println("Hello, world!!"); // Advance cursor to beginning of next line
          System.out.println();                 // Print empty line
          System.out.print("Hello, world!!");   // Cursor stayed after the printed string
          System.out.println("Hello,");
          System.out.print(" ");                // Print a space
          System.out.print("world!!");
      }
	  
	  static void primitives() {
	      System.out.println("\n\nInside primitives ...");
		  int intHex = 0x0041; // 16 power 0 * 1 + 16 power 1 * 4
		  System.out.println("intHex: " + intHex);
		  
		  // Java 7
		  int intBinary = 0b0100_0001;
		  System.out.println("intBinary: " + intBinary);
		  
		  int intOctal = 0101;
		  System.out.println("intOctal: " + intOctal);	
		  
		  int intChar = 'A';
		  System.out.println("intChar: " + intChar);

          char charInt = 65;
		  System.out.println("charInt: " + charInt);	
		  
		  char charHex = 0x0041;
		  System.out.println("charHex: " + charHex);	
		  
		  char charBinary = 0b0100_0001;
		  System.out.println("charBinary: " + charBinary);	
	  }
	  
	  static void typeCasting() {
          System.out.println("\nInside typeCasting ...");
          // Explicit casting
          long y = 42;
          //int x = y;
          int x = (int)y;
      
          // Information loss due to out-of-range assignment
          byte narrowdByte = (byte)123456;
	      System.out.println("narrowdByte: " + narrowdByte); 
	  
	      // Truncation
	      int iTruncated = (int)0.99;
	      System.out.println("iTruncated: " + iTruncated); 
	  
	      // Implicit cast (int to long)
	      y = x;
	  
	      // Implicit cast (char to int)
	      char cChar = 'A';
	      int iInt = cChar; 
	      System.out.println("iInt: " + iInt);
	  
	      // byte to char using an explicit cast
	      byte bByte = 65;
	      cChar = (char)bByte; // special conversion (widening from byte --> int followed by narrowing from int --> char)
	      System.out.println("cChar: " + cChar);
      }
	  
	  
      static void arrays() {
	      System.out.println("\nInside arrays ...");
		  int[] scores = new int[4];	

		  scores[0] = 90;
		  scores[1] = 70;
		  scores[2] = 80;
		  scores[3] = 100;
		  
		  /*int[] scores = new int[] {90, 70, 80, 100};*/
		  
		  //int[] scores = {90, 70, 80, 100};
		  
		  System.out.println("Mid-Term 1: " + scores[0]);
		  System.out.println("Mid-Term 2: " + scores[1]);
		  System.out.println("Final: " + scores[2]);
		  System.out.println("Project: " + scores[3]);
		  System.out.println("# exams: " + scores.length);
		  
		  Student[] students = new Student[3];//{new Student(), new Student(), new Student()};
		  students[0] = new Student();
		  students[1] = new Student();
		 // students[2] = new Student();
		  /*students[0].name = "John";
		  students[1].name = "Raj";
		  students[2].name = "Anita";*/
		  System.out.println("Student 1: " + students[0]);
		  System.out.println("Student 2: " + students[1]);
		  System.out.println("Student 3: " + students[2]);
	  }
	  
	  public static void main(String[] args) {	
	   	  // Language Basics 1
		  //print();	  
		  //primitives();
		  //typeCasting();	
          arrays();		  
	  }       
}