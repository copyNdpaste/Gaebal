package Practices;

public class Practice3_2 {

	public static void main(String[] args) {
		int numOfApples = 123;
		int sizeOfBucket = 10;
		int N;
		N= numOfApples/sizeOfBucket;
		int numOfBucket = (N);				
		if(numOfApples%sizeOfBucket>0){
		numOfBucket+=1;
		}System.out.println("필요한 바구니의 수 :"+ numOfBucket);
		}
		
	}