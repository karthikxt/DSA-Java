public class NumberPattern{
	
	/*
	12345
	12345
	12345
	12345
	*/
	
	public static void main(String[] args){
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
		
		/*
		11111
		22222
		33333
		44444
		55555
		*/
		
		
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				System.out.print(i);
			}
			System.out.println();
		}
		
	}
}