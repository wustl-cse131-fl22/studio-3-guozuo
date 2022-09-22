package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("You will need to find all prime numbers up to :");
		int n = in.nextInt();
		boolean[] primeNumber = new boolean[n+1];
		int i;
		
		for (i=2;i<=n;i++) {
			primeNumber[i]=true;
		}
		
		for (int j=2; j <= Math.sqrt(n); j++) {
			if (primeNumber[j] == true) {
				for (int k = j*j; k <= n; k += j) {
					primeNumber[k] = false;
				}
			}
		}
		
		for (int m = 2; m <= n; m++) {
			if (primeNumber[m]==true) {
				System.out.println(m);
			}
		}
		

	}

}
