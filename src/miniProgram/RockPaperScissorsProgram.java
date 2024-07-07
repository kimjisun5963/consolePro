package miniProgram;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsProgram {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("가위바위보 게임을 시작합니다!");
		int cnt = 0;
		int win = 0;
		int draw = 0;
		int lose = 0;
		boolean end = true;
		while(end == true) {
			System.out.println("1.바위	2.가위	3.보");
			System.out.print("번호를 입력하세요 >");
			int inputData = sc.nextInt();
			Random random = new Random();
			int randomNum = random.nextInt(3)+1;
			System.out.println("컴퓨터 : " + randomNum);
			int result = inputData-randomNum;
			if(result == -1 || result == 2) {
				System.out.println("당신이 이겼습니다!");
				win++;
			}else if(result == -2 || result == 1) {
				System.out.println("당신이 졌습니다...");
				lose++;
			}else if(result == 0) {
				System.out.println("무승부...!");
				draw++;
			}
			cnt++;
			System.out.println(cnt + "전 " + win + "승 " + lose + "패 " + draw + "무");
			System.out.print("게임을 종료하시겠습니까?(y/n)");
			String answer = sc.next();
			if(answer.equals("y")) {
				end = false;
			}
		}
		System.out.println("게임이 종료되었습니다.");
		sc.close();
	}

}
