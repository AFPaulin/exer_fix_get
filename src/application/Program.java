package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Students;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Set<Students> set = new HashSet<>();
		
		System.out.print("How many students for course A? ");
		int n = sc.nextInt();
			
		
		for (int i=1;i<=n;i++) {
			int code = sc.nextInt();
			set.add(new Students(code, 'A'));
		}

		System.out.print("How many students for course B? ");
		n = sc.nextInt();
			
		
		for (int i=1;i<=n;i++) {
			int code = sc.nextInt();
			set.add(new Students(code, 'B'));
		}
		
		System.out.print("How many students for course C? ");
		n = sc.nextInt();
			
		
		for (int i=1;i<=n;i++) {
			int code = sc.nextInt();
			set.add(new Students(code, 'C'));
		}
		
		System.out.print("Total students: " + set.size());
		
	}

}
