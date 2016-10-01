package array;

public class practice5_4 {

	public static void main(String[] args) {
				int [][]arr={
						{5,5,5,5,5},
						{10,10,10,10,10},
						{20,20,20,20,20},
						{30,30,30,30,30}
					};
				int total =0;
				float average=0;
				int i,j;
		for(i=0;i<5;i++){
			for(j=0;j<5;j++){
				total  +=arr [i][j];
			}}
		average = total/(float)20;	
				System.out.println("total="+total);
				System.out.println("average="+average);
			}
	}