/* File: JarType.java */

/** JarType Class

A class for working with jars.

*/

/*
Edit History:
<date> <your-name> Initial version
<date> <your-name> Add the capability to refill a jar
<date> <your-name> Guard against negative numbers.
<date> <your-name> Add the capability subtract from a jar (the sub method)
<date> <your-name> Keep track number of jar created
<date> <your-name> Add a constructor that accepts a character
<date> <your-name> Add equals method to compare two jars

*/

public  class JarType
{
     private int numUnits;    // Data member
     private static int jarCount = 0;

      /** Default constructor */
      public JarType()     // Constructor
      {
	   	numUnits = 0;
	   	System.out.println("Rinsing jar");
	   	jarCount++;
      }

      /** Constructor to prefill a jar */
      public JarType(int n)
      {
		  numUnits = n;
		  System.out.println("Prefill jar");
		  jarCount++;
      }

      /** Constructor that accepts a character */

      public JarType(char c)
      {
		  switch( c )
		  {
			  case 'p': numUnits = 16;
			            break;
			  case 'q': numUnits = 32;
			            break;
			  default:  numUnits = 0;
			            System.out.println("Invalid character was suppied: " + c);
		  }
		  jarCount++;
	  }

      /**
        Add to the jar.
        @param n  the value to add to jar
      */
      public void add(int n)
      {
		 if (n >= 0) {
            numUnits = numUnits + n;
	     }
	     else {
			 System.out.println("Cannot add a negative number of jar.");
	     }
      }

      /**
        Empty out the jar.
      */
      public void emptyItOut()
      {
      	numUnits = 0;
      }

      /**
        Return the number of units in the jar

        @return  number of units
      */
      public int quantity()
      {
      	return numUnits;
      }

      /**
        Subract from the jar.
        @param n  the value to subtract from jar
      */
      public void sub(int n)
      {
		 if (n >= 0) {
			if ( (numUnits - n) >= 0 ) {
                numUnits = numUnits - n;
		    }
		    else {
				System.out.println("Not enough units in the jar.");
			}
	     }
	     else {
			 System.out.println("Cannot subtract a negative number from jar.");
	     }
      } // end of sub()

      public static int getJarCount()
      {
		  return jarCount;
	  }

	  public boolean equals(JarType otherJar) {
	      if (this.numUnits == otherJar.numUnits)
	          return true;
	      else
	          return false;
	  }

} // end of class JarType

