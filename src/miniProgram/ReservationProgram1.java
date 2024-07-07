package miniProgram;

import java.util.Scanner;

public class ReservationProgram1 {

	public static void main(String[] args) {
		int[] arr = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int cnt = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(cnt < 10) {
			for(int i = 1 ; i <= 10 ; i++ ) {
				System.out.print(i + " ");
			}
			System.out.print("\n");
			System.out.println("--------------------");
			for(int i = 0 ; i <= 9 ; i++ ) {
				System.out.print(arr[i] + " ");
			}
			System.out.print("\n");
			System.out.print("예약 번호를 선택해주세요(1~10)> ");
			int inputData = sc.nextInt();
			if(arr[inputData-1] == 0) {
				arr[inputData-1] = 1;
				cnt++;
			}else {
				System.err.println("이미 예약된 좌석입니다.");
			}
			//System.out.println("cnt : " + cnt);
		}
		System.out.print("\n");
		System.err.println("모든 좌석이 매진되었습니다.");
		sc.close();
		

	}

}
