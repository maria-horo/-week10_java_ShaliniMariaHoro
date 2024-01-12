package pattern;

public class KajuKatliPattern {
	
	public void pattern(int rows) {
		for (int outerloop1 = 1; outerloop1 <= rows; outerloop1++) {
			for (int innerloop1 = 1; innerloop1  <= rows - outerloop1; innerloop1++) {
				System.out.print(" ");
			}
			for (int innerloop2 = 1; innerloop2 <= outerloop1; innerloop2++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		for (int outerloop2 = rows - 1; outerloop2 >= 1; outerloop2--) {
			for (int innerloop1 = 1; innerloop1 <= rows - outerloop2; innerloop1++) {
				System.out.print(" ");
			}
			for (int innerloop2 = 1; innerloop2 <= outerloop2; innerloop2++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		KajuKatliPattern kajukatli = new KajuKatliPattern();
		kajukatli.pattern(5);
	}
}
