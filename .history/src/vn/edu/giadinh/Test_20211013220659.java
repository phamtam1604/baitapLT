package vn.edu.giadinh;

import java.util.Scanner;

public class Loop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for ( int i = 1;i <= n; i++){
			System.out.print(i + " ");
		}
	}
}