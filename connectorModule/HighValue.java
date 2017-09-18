import java.util.Scanner;

public class HighValue {
	public static void main(String args[])
	{
		int fno;
		int sno;
		int tno;
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter Fisrt number");
	fno = sc.nextInt();
	
	System.out.println("Please enter Second number");
	sno = sc.nextInt();
	
	System.out.println("Please enter Third number");
	tno = sc.nextInt();
	
	if(fno > sno && fno > tno) {System.out.println("First Number is greater :" + fno);}
	else if 
	(sno > fno && sno > tno) {System.out.println("Second Number is greater :" + sno);}
	else if 
	(tno > sno && tno > fno) {System.out.println("Third Number is greater :" + tno);}
	else
	{System.out.println("Number are valid ");}
		
	}

}
