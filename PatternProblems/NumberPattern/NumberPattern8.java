public class NumberPattern8{
	
	/*
	1
	121
	12321
	1234321
	123454321
	
	*/
	
	
	public static void main(String[] args){
		for(int i=1;i<=5;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j);
			}
			for(int j=i-1;j>=1;j--){
				System.out.print(j);
			}
			
			System.out.println();
		}
		
	}
}