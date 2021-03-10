package algorithm;

import java.util.ArrayList;

public class PrimeNumber {
	
	public void getPrime(int num) {
		
		ArrayList<Integer> prime = new ArrayList<Integer>();
		prime.add(2);

		for (int i = 2; i <= num; i++) {
			for (int j = 0; prime.size() > j; j++) {
				if (i % prime.get(j) == 0) { 
					break; // 소수가 아닌 경우 pass
				}
				if (j + 1 == prime.size()) {
					// 소수일 때
					prime.add(i);
				}
			}
		}

		for (Integer result : prime) {
			System.out.println(result);
		}
	}
	
	public void getPrime2(int num) {

		int i = 2;	// i : 나눌 대상

		boolean isPrime = true;
		ArrayList<Integer> prime = new ArrayList<Integer>();

		while (i <= num) {
			isPrime = true;
			for (int n = 2; n < i; n++) {
				if (i % n == 0) {
					isPrime = false;
				}
				continue;
			}

			if (isPrime == true)
				prime.add(i);
			i++;
		}
		
		for (Integer result : prime) {
			System.out.println(result);
		}
	}
		
	
	public static void main(String[] args) {
		PrimeNumber primeNumber = new PrimeNumber();
		long start = System.currentTimeMillis();
		primeNumber.getPrime(50000);
		long end = System.currentTimeMillis();
		System.out.println("수행시간" + (end - start));
	}

}
