package stratergy_Package;

import java.util.Scanner;


public class Human_PS extends Playing_Stratergy{
	Scanner sc = new Scanner(System.in);
	@Override
	public int[] getCoordinates() {
		boolean valid  = false;
		int[] m = new int[2];
		while(!valid) {
			System.out.println("Enter x and y Coordinates ");
			int x = sc.nextInt();
			int y = sc.nextInt();
			valid = validateMove(x,y);
			if(!valid) {
				System.out.println("coordinates are invalid");
			} else {
				m[0] = x;
				m[1] = y;
			}
		}
		return m;
	}
}
