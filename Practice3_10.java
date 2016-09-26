package Practices;

public class Practice3_10 {

	public static void main(String[] args) {
	char ch='A';
	char A;
	int lowerCase = (ch>=65&&ch<=90)?ch+32:ch;
	
	A=(char)lowerCase;
	System.out.println("ch:"+ch);
	System.out.println("ch to lowerCase:"+A);

	}

}
