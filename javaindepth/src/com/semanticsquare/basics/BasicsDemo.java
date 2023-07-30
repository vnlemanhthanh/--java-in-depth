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
	  // literals demo
	  int intHex = 0x0041;
	  System.out.println("intHex: " + intHex);
	  int intBinary = 0b01000001;
	  System.out.println("intBinary: " + intBinary);
	  int intChar = 'A'; // holds decimal equivalent, which is 65
	  System.out.println("intChar: " + intChar);
	  int intUnderscore = 1_23_456;
	  System.out.println("intUnderscore: " + intUnderscore);
	  
	  char charA = 'A';
	  System.out.println("charA: " + charA);
	  char charInt = 65;
	  System.out.println("charInt: " + charInt);
	  char charUnicode1 = '\u0041'; // 4 * (16 power 1 )+ 1 * (16 power 0)
	  System.out.println("charUnicode1: " + charUnicode1);
	  char charUnicode2 = 0x41;     // 4 * (16 power 1 )+ 1 * (16 power 0)
	  System.out.println("charUnicode2: " + charUnicode2);
	  char charBinary = 0b01000001; // binary corresponding to decimal 65
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
	   int[] myArray = new int[]{9, 11, 2, 5, 4, 4, 6};
       System.out.println("myArray.length: " + myArray.length);
	   System.out.println("myArray[1]: " + myArray[1]);
	   System.out.println("myArray[7]: " + myArray[7]);	   
	}

    static void threeDimensionalArrays() {
	   System.out.println("\nInside threeDimensionalArrays ...");
	   int[][][] unitsSold = new int[][][]{ 
										   { // New York
											 {0,0,0,0}, // Jan
											 {0,0,0,0}, // Feb
											 {0,0,0,0}, // Mar
											 {0,850,0,0}// Apr	
										   },
										   { // San Francisco
											 {0,0,0,0}, // Jan
											 {0,0,0,0}, // Feb
											 {0,0,0,0}, // Mar
											 {0,0,0,0}  // Apr
										   },
										   { 
											 {0,0,0,0},
											 {0,0,0,0},
											 {0,0,0,0},
											 {0,0,0,0}
										   },
										   {
											 {0,0,0,0},
											 {0,0,0,0},
											 {0,0,0,0},
											 {0,0,0,0}
										   }
										 };
		                    	 
		System.out.println("unitsSold[0][3][1]: " + unitsSold[0][3][1]);
	}	
	
	static void varargsOverload(boolean b, int i, int j, int k){
	   System.out.println("\nInside varargsOverload without varargs ...");
	}
	static void varargsOverload(boolean b, int... list){
	   System.out.println("\nInside varargsOverload with varargs ...");
	   System.out.println("list.length: " + list.length);
	}	
	
		
	static void preAndPost() {
		System.out.println("\nInside preAndPost ...");
		
		int x = 5;
		
		//--x;		
		//System.out.println("x: " + x);	

		//int y = x--;		
		//System.out.println("y: " + y + ", x: " +  x);
		
		int index = 0;
		int[] array = new int[3];
		array[index++] = 10;		
		array[index++] = 20;		
		array[index++] = 30;
		
		System.out.println(index);
	}
	
	
	static void compoundArithmeticAssignment() {
		int x = 100;
		
		System.out.println("x += 5: " + (x += 5));
		System.out.println("x -= 5: " + (x -= 5));
		System.out.println("x *= 5: " + (x *= 5));
		System.out.println("x /= 5: " + (x /= 5));
		System.out.println("x %= 5: " + (x %= 5));
		
		// Invalid
		System.out.println("x =+ 5: " + (x =+ 5)); // Unary plus ~ x = +5
		System.out.println("x =- 5: " + (x =- 5)); // Unary minus ~ x = -5
		/*System.out.println("x =* 5: " + (x =* 5));
		System.out.println("x =/ 5: " + (x =/ 5));
		System.out.println("x =% 5: " + (x =% 5));*/
	}
	
	static void isOddOrEven(int num) {
		System.out.println(num % 2);
	}
	
	static void charTypePromotion() {
	  System.out.println("\nInside charTypePromotion ...");
	  char char1 = 50; // Will be assigned corresponding UTF16 value 2
	  System.out.println("char1: " + char1); 
	  System.out.println("(73 - char1): " + (73 - char1)); // char1 gets promoted to int, i.e., decimal equivalent 50 in UTF16 is used	  
	  System.out.println("(char1 - '3'): " + (char1 - '3')); // char1 & '3' are promoted to ints	
	  System.out.println("('a' + 'b'): " + ('a' +'b')); // 'a' & 'b' are promoted to ints and the respective equivalents 97 & 98 are added
    }
	
	
	// Comparison or Relational operators
	static void comparisonOperators() {
	    System.out.println("\nInside comparisonOperators ...");
		int age = 20;
	    /*if (age > 21) {
			System.out.println("Graduate student");
		}*/
		System.out.println("age > 21: " + (age > 21));
		System.out.println("age >= 21: " + (age >= 21));  
		System.out.println("age < 21: " + (age < 21));
		System.out.println("age <= 21: " + (age <= 21));	  
		System.out.println("age == 21: " + (age == 21)); // equal to (equality operator)
		System.out.println("age != 21: " + (age != 21)); // not equal to (equality operator)
		
		boolean isInternational = true;
		//System.out.println("isInternational <= true: " + (isInternational <= true));  
		System.out.println("isInternational == true: " + (isInternational == true)); 
		System.out.println("isInternational != true: " + (isInternational != true));
		
		Student s1 = new Student(1000, "Dheeru");
		Student s2 = new Student(1000, "Dheeru");
		System.out.println("s1 == s2: " + (s1 == s2)); // See object class
		System.out.println("s1 != s2: " + (s1 != s2));
		
		update(s1, "John");
	}		
	
	static boolean update(Student s, String name) {
	    if (s == null) {
		   return false;
		}
		
		s.name = name;		
		return true;
	}
	
	static void logicalOperators() {
		System.out.println("\nInside logicalOperators ...");
		int age = 37;
	    int salary = 85000;
	    boolean hasBadCredit = false;
		
		// 1. Core (AND, OR, NOT & Operator Chaining)
	    
	    if (age > 35 && salary > 90000 || !hasBadCredit) {
	    	System.out.println("Loan approved!");
	    } else {
			System.out.println("Loan not approved!");
		}
		
		// 2. 
		//    (a) Left-associative ~ Order of grouping
		//    (b) Associativity (a && b) && c = a && (b && c)
		//    Applies to both && and ||
		
		
		// 3. 
		//    (a) Operator precedence of Logical Operators: Helps with ONLY grouping operations. Not order of execution. (! > && > ||)
		
		          // Other Examples: A && B || C && D = (A && B) || (C && D)
				  //                 A && B && C || D = ((A && B) && C) || D
		
		
		//    (b) Operator Precedence across logical, comparison and arithmetic
		//          ! > arithmetic > comparison > &&, ||
		//    See resources section for complete precedence rules
		
		// ALWAYS USE PARENTHESIS for READABILITY. Not everyone is aware of precedence rules
		
		// 4. Use && to avoid NullPointerException
		Student s1 = new Student(1001, "Raj");
		update(s1, "Dheeru");
	}
	
		
	
	public static void main(String[] args) {	
	  // Language Basics 1
	  //print();				
	  //primitives();
	  //typeCasting();
	  //arrays();	
      //threeDimensionalArrays();	
      /*varargsOverload(true, 1, 2, 3);
      varargsOverload(true, 1, 2, 3, 4, 5, 6, 7, 8);	  
      varargsOverload(true);*/
	  
	  //preAndPost();
	  //compoundArithmeticAssignment();
	  //isOddOrEven(51);
	  //charTypePromotion();	  
      //comparisonOperators();
      logicalOperators();	  
	  
    }  

    	
  }