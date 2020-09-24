package curso_java;

import java.util.Scanner;

public class matriz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int [][]mat=new int[n1][n2];
		
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
			if(n1==i) {
				System.out.println("n1 maior");
			}
			else
			System.out.println("n2 maior");
		}
	}

}
