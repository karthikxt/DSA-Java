public class NumberPattern2{
	
	/*
	
	54321
	54321
	54321
	54321
	54321
	
	*/
	
	public static void main(String[] args){
		for(int i=5;i>=1;i--){
			for(int j=5;j>=1;j--){
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("");
		
		/*
		
		55555
		44444
		33333
		22222
		11111
		
		*/
		
		
		for(int i=5;i>=1;i--){
			for(int j=5;j>=1;j--){
				System.out.print(i);
			}
			System.out.println();
		}
	}
}