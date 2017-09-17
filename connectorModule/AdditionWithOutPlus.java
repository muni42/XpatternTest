import java.util.Scanner;


public class AdditionWithOutPlus {

    static int add(int x, int y)

    {

        int carry;

        while(y!=0)

        {

            carry = x & y;

            x = x ^ y;

            y = carry << 1;

        }

        return x;

    }
    
    
 
    public static void main(String args[])

    {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the X number:");

        int x = input.nextInt();
        
        System.out.println("Enter the Y number:");
        
        int y = input.nextInt();

        System.out.println("The Summation is: "+add(x, y));

        input.close();

    }



	}





