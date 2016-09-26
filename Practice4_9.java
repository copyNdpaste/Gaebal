package Practices;

public class Practice4_9 {

	public static void main(String[] args) {
		String str="12345";
		int sum=0;
		for(int i=0;i<str.length();i++){
			//sum = sum + str.charAt(i);
	//"12345" 각각을 하나의 문자로 봐서 1은 아스키코드 45로 계산한다..
			
			sum = sum + str.charAt(i) -'0';
		}
System.out.println("sum="+sum);
	}
}