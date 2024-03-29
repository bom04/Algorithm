// 숫자 카드 게임
package book.greedy2_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		String[] a=reader.readLine().split(" ");
		int N=Integer.parseInt(a[0]);
		int M=Integer.parseInt(a[1]);
		int max=0;
		
		for(int i=0;i<N;i++) {
			int min=Integer.MAX_VALUE;
			String[] card=reader.readLine().split(" ");
			for(int j=0;j<card.length;j++) {
				min=Math.min(Integer.parseInt(card[j]),min);
			}
			max=Math.max(min, max);
		}
		System.out.println(max);
	}
}
