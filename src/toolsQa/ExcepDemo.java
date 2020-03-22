package toolsQa;

import java.io.FileNotFoundException;

public class ExcepDemo {

	public static void main(String[] args) throws FileNotFoundException {
		try {
		display();}
		catch(FileNotFoundException e){
		System.out.println("Main");
		}
		
	}

	
	static void display() throws FileNotFoundException
	{
		System.out.println("Test");
		
		throw new FileNotFoundException("");
	}
	
	
}
