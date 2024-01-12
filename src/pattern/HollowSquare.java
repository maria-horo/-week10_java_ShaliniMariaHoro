package pattern;

public class HollowSquare {

	public void hollow() {
		int rows = 5;
		int columns = 5;

		for (int outerloop = 1; outerloop <= rows; outerloop++) {
			for (int innerloop = 1; innerloop <= columns; innerloop++) {
				if (outerloop == 1 || outerloop == rows || innerloop == 1 || innerloop == columns) {
					System.out.print("* ");
				} else {
					System.out.print("  "); 
				}
			}
			System.out.println();
		}

	}
	public static void main(String[] args) {
		HollowSquare starHollowSquare = new HollowSquare();
		starHollowSquare.hollow();

	}

}
