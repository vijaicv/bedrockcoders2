import java.util.*;
import java.io.*;
class Main
{
	public static void main(String args[])
	{
	System.out.print("\nGitHUb Example\n");
	addition ad=new addition();
	AlwinDivision div=new AlwinDivision();
	Multiply mul=new Multiply();
	subtraction sub=new subtraction();
	vijaicv md=new vijaicv();
	

	div.divideNumbers(10,4);
	mul.prduct(4,6);
	sub.subtract(5,2);
	md.modulus(6,2);
	ad.add(3,3);
	System.out.println("All Completed");
	
	}
}