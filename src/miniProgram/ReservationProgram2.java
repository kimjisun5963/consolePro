package miniProgram;

import java.util.Scanner;

public class ReservationProgram2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = {{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0}};
		int cnt= 0;
		while(cnt < 25) {
			for(int i = 0 ; i < arr.length; i++ ) {
				for(int j = 0; j< arr[i].length ; j++) {
					System.out.print("[" + arr[i][j] + "]");
				}
				System.out.print("\n");
			}
			
			System.out.print("예약할 좌석 번호를 입력해주세요(1~25)> ");
			int inputData = sc.nextInt();
			int row = (inputData-1) / 5;
			int col = (inputData-1) % 5;
			//System.out.println("row : " + row);
			//System.out.println("col : " + col);
			if(arr[row][col] == 0) {
				arr[row][col] = 1;
				cnt++;
			}else {
				System.out.println("이미 예약된 좌석입니다.");
			}
		}
		System.err.println("모든 좌석이 매진되었습니다.");
	}

}
