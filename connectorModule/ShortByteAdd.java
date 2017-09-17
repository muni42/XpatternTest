import java.util.Scanner;
public class ShortByteAdd {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    System.out.print("Enter a Byte number: ");
	    byte numberByte = scanner.nextByte();
	    System.out.println("The number is: " + numberByte);
	    
	    System.out.print("Enter a Short number: ");
	    short  numberShort = scanner.nextShort();
	    System.out.println("The Short is: " + numberShort);
	    
	    System.out.print("Adding both Byte and short: ");
	    int numberInt = (numberByte + numberShort);
	    System.out.println("After Adding both result in INT : " + numberInt );
	    
	    System.out.print("Enter a Short for add with Int number: ");
	    short  numberShort1 = scanner.nextShort();
	    System.out.println("The number is: " + numberShort1);
	    
	    System.out.print("Enter a Int for add with Short number: ");
	    int numberInt1 = scanner.nextInt();
	    System.out.println("The number is: " + numberInt1);
	    
	    System.out.print("Adding both Int and short Store it in LONG: ");
	    long numberLong = (numberShort1 + numberInt1);
	    System.out.println("After Adding both result in LONG : " + numberLong );
	    
	    System.out.print("Enter a Long for add with Int number: ");
	    long numberLong1 = scanner.nextLong();
	    System.out.println("The number is: " + numberLong1);
	    
	    System.out.print("Adding both Int and Long Store it in FLOAT: ");
	    long numberFloat = (numberLong1 + numberInt1);
	    System.out.println("After Adding both result in FLOAT : " + numberFloat );
	    
	    System.out.println("Enter a Long for add with Int number: ");
	    float numberFloat1 = scanner.nextFloat();
	    System.out.println("The number is: " + numberFloat1);
	    
	    System.out.print("Adding both Int and Long Store it in DOUBLE: ");
	    double numberDouble = (numberLong1 + numberInt1);
	    System.out.println("After Adding both result in DOUBLE : " + numberDouble );

	    
	    
	    scanner.close();
	  }

}
