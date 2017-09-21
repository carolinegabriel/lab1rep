
/**
 * CS 2003 - Lab 1. Code to compute the average of doubles from an input
 * file.  NOTE: add data members and methods at your convenience. Use
 * the most accurate data types. You can reuse bits of code from
 * the class Lab1a.
 *
 * 
 */

import java.util.Scanner;
import java.util.Vector;
import java.io.File;
import java.io.IOException;


/**
 * This class reads from an input file and calculates the average of doubles
 * @version 1.0
 * @author caroline
 * @since 9/1/17
 */
public class Lab1b {
    
    // data members

	
	
    /** Constructor: calls method readFile that reads the doubles
     * contained in the file "<code>filename</code>" and computes the
     * average of the elements.
     @param Lab1b name of the file containing doubles.
    */
    public Lab1b(String Lab1b) {
	readFile(Lab1b);
    }

    
    
    /** Reads in doubles from a file named <code>Lab1b</code> ,
     * computes and displays the average of the elements contained in the file
     * @param Lab1b name of the file containing the doubles 
     */
    public void readFile(String Lab1b)  {
		try {
		    File inputFile = new File("Lab1b.dat");
		    Scanner input = new Scanner(inputFile);
		    Vector<Double> list = new Vector<Double>();
		    Double sum=0.0, elt=0.0;
		    int count=0;
		    
		    // store all elements in a vector
		    	    
		    while (input.hasNextDouble()) {
		    	elt = input.nextDouble(); 
			    count++;
			    sum+=elt;
			    list.addElement(elt);

	    }
	    // print on the terminal each elements of list
	    System.out.printf("There are %d numbers in the input file:\n",
			       count);
	    for (Double value: list)
		System.out.printf("%2.3f ",value);
	    System.out.println();
	    
	    //computes and displays the average
	    	System.out.println("Here is the average value:");
	    	Double avg = sum / count;
	    	System.out.println(avg);
	    	
	    	input.close();
	    
	} 
		catch (IOException e) {
			System.err.println("IOException in reading input file!!!");
	    
		}
	}	
   
    //end readFile()
    
    

    /** main : creates a Lab1b Object with the filename passed in
     * argument
     * @param args command line arguments
     * */
    public static void main(String args[]) {
    	if (args.length == 0)
    		System.err.println("enter the data file name!");
    	else
    		new Lab1b(args[0]);
    } //end main
    
} //end class Lab1b
