package line_comparision;
import java.util.*;

import line_comparision.utility.Utility;
public class LineComparision {

	public static int x1 ,x2,x3,x4;
	public static int y1,y2,y3,y4;
	public static String strLen1;
	public static String strLen2;
	
	
	
	
	public static void inputCordinates() {
		Utility utility = new Utility();
		System.out.println(" enter the value of x & y ");
		x1 = utility.getIntValue();
		x2 = utility.getIntValue();
		x3 = utility.getIntValue();
		x4 = utility.getIntValue();
		y1 = utility.getIntValue();
		y2 = utility.getIntValue(); 
		y3 = utility.getIntValue();
		y4 = utility.getIntValue();
		System.out.println(" the cordinates of lines 1 is ::" + "(" + x1 +"," + y1 +")" + "and"  +  "(" + x2 +"," + y2 +")");
		System.out.println(" the cordinates of lines 1 is ::" + "(" + x3 +"," + y3 +")" + "and"  +  "(" + x4 +"," + y4 +")");
	
	}   

	public void lengthOfLine() {
		double len_line1 = Math.sqrt(((x2-x1 ) * (x2 - x1)) + ((y2-y1) * ( y2 - y1)));
		double len_line2 = Math.sqrt(((x4-x3 ) * (x4 - x3)) + ((y4-y3) * ( y4 - y3)));
		strLen1 = Double.toString(len_line1);
		strLen2 = Double.toString(len_line2);
	}
	public static void main(String[] args) {
		inputCordinates();
	    LineComparision linecompare = new LineComparision();
	    linecompare.lengthOfLine();
	    System.out.println(strLen1.equals(strLen2));
	    System.out.println(strLen1.compareTo(strLen1));
		
		
	}
}

	
			
		
