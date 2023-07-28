  import java.math.BigDecimal;
  
  class BasicsDemo {

		BasicsDemo() {
			primitives();
			super();
		}  	
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
  
    public static void main(String[] args) {	
	  // Language Basics 1
	  //print();				
	  //primitives();
	  //typeCasting();
	  //arrays();	
      threeDimensionalArrays();	  
    }       
  }