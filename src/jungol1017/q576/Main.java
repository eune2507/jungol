package jungol1017.q576;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		String [] ar = str.split(" ");
		int A = Integer.parseInt(ar[0]);
		int B = Integer.parseInt(ar[2]);
		
		if(ar[1].equals("+")) {
			System.out.print(A+" + "+B+" = "+(A+B));
		} else if (ar[1].equals("-")) {
			System.out.print(A+" - "+B+" = "+(A-B));
		} else if (ar[1].equals("*")) {
			System.out.print(A+" * "+B+" = "+(A*B));
		} else if (ar[1].equals("/")) {
			System.out.print(A+" / "+B+" = ");
			System.out.printf("%s", (A/B));
		} else {
			System.out.print(A+" "+ar[1]+" "+B+" = 0");
		}

	}

}
