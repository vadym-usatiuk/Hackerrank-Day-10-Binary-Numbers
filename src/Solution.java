import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		Scanner in = new Scanner(System.in);
		int counter = 0, max = 0;
		while (n > 0) {
			int rem = n % 2;
			if (rem == 1)
				counter++;
			else
				counter = 0;
			max = Math.max(counter, max);
			n /= 2;
		}
		System.out.println(max);
		scanner.close();
	}
}
