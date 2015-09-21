import java.util.Scanner;
import java.util.Random;


public class loopstatements {
	
	public static void main(String[] args)
	{
		
		int x = 1; 
		int i;
		int count = 0;
		
		Scanner myScanner;
		myScanner = new Scanner(System.in);
		
		
// "while" loop
		while (x == 1) { // "while" loop, tests before it runs
			
			System.out.println ("loop 1: number of x's is " + count++); // ++ add one _after_ it runs the loop
			x = myScanner.nextInt(); 
			if ( x > 10 )
			{ break; }
			System.out.println("skip this when I type a number over 10");
			// count++ = count + 1 post-fix operator
			// ++count = 1 + count pre-fix operator
		}
		
// "do-while" loop, declare answer at end
		do {
			System.out.println ("loop 2: number of x's is " + count);
			x = myScanner.nextInt(); 
				if ( x > 10 ) 
			{break;}
			count = count + 1; 
		} while (x == 1 );
	
// "for" loop, only with integers
		
		System.out.println("count is " + count);
		myScanner.nextLine();
		
		Random myRandomgenerator = new Random();
		int pick = 0; 
		
		for ( i = 1; i < 10; i++) // i = 1, run until i is 10 or more, i plus 1 each time
		{
			System.out.println (i + " times through this loop ");
			pick = myRandomgenerator.nextInt(10)+3; 
				// pick is an integer set at 0, but then we're putting a new thing in it
				// nextInt() gives a number between 0 and 1,
					// (10) multiply random number by 10, truncate to an integer, then add 3. Could be 3 to 12, can't get a 13. 
			System.out.println("a number between 3 and 13 is: " + pick );
			myScanner.nextLine();
		}
		
		myScanner.close();
		return;
		
	}
}
