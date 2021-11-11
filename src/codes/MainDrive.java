package codes;

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

	}

}
