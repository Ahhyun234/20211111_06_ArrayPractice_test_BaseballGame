package codes;

import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {

//		컴퓨터가 3자리 숫자 문제 출제
//		문제는 3칸의 배열로 만들것임
		int[] cpuNumbers = new int[3];

//		하나의 칸 마다 랜덤 숫자를 채울 것임

		for (int i = 0; i < cpuNumbers.length; i++) {

//			써도 되는 숫자가 나올 때 까지 무한 반복

			while (true) {
//				1~9중 하나를 랜덤으로 추출
				int randomNum = (int) (Math.random() * 9 + 1);

//				중복 검사. 같은 값이 있는지?
				boolean isDupOk = true;

				for (int cpuNum : cpuNumbers) {
					if (randomNum == cpuNum) {
//						//여기있는 수는 사용하면 안됨
						isDupOk = false;

					}
				}

//				써도 되는 숫자면, 집어넣고 아니면 넘어가자

				if (isDupOk) {
					cpuNumbers[i] = randomNum;
					break;

				}
			}
		}
		
		
//		나온 문제가 어떤 값인지 출력 //////////////////////////Sammi question+배열 출력은 꼭 for여야 하는가?
		for(int cpuNum : cpuNumbers) {
			System.out.println(cpuNum);
		}
		
//		실제 사용자에게 3자리 숫자를 입력 받자( 3S를 맞출때 가지 계속)

		Scanner myScanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("3자리 정수");
			int inputNum = myScanner.nextInt();
			
//			123 => [1,2,3] => 배열 형태로 분리하자 => 문제 배열과 비교하기 편해짐
			
			int[]userNumbers = new int[3];
			
//			userNumbers[0] = 입력한 숫자의 100의 자리
			
			userNumbers[0]= inputNum/100;
			
//			userNumbers[1] = 입력한 숫자의 10의 자리
			
			userNumbers[1]=  inputNum/10 % 10; 
			
//			userNumbers[2] = 입력한 숫자의 1의 자리
			
			userNumbers[2] = inputNum%10;
			
		}
		
	}

}
