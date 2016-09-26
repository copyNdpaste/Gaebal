package Practices;

public class Practice4_14 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
	int answer = (int)(Math.random()%100+1);
	int input =0;
	int count =0;
	
	java.util.Scanner s = new java.util.Scanner(System.in);
	
	do{
		count++;
		System.out.print("1과 100사이의 값을 입력하세요:");
		input = s.nextInt();
		
		if(answer == input){
			System.out.println("정답입니다.");
			System.out.println("시도 횟수는"+count+"번입니다.");
			break;
		}
	}while(true);

	}
}