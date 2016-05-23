import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {

		int x, n, counts;

		Scanner scan = new Scanner(System.in);

		counts = scan.nextInt();
		
		for (int i = 0; i < counts; i++) {
			n = 0;
			x = scan.nextInt();
			while (x != 1) {
				
				x = ((x%2)==0) ? x/2 : 3*x + 1;
				
				n++;

			}
			System.out.println(n);
		}
		
		scan.close();
	}
}
