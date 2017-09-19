
public class XpatternTest {
	public static void main(String args[]) {
		for(int row = 0;row < 5;row++) {
			for(int col = 0;col < 5;col++) {
				if(row == col || row + col == 5-1) {
					System.out.print("*");
				}else {
					if(!(row == 1 && col > 3) && !(row == 2 && col > 2) && !(row == 3 && col > 2)) {
						System.out.print("__");
					}
				}
			}
			System.out.println();
		}
	
	}
}
