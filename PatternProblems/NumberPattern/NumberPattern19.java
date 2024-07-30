public class NumberPattern19{
	
	/*
	
	   3
	 6  6
	9  9  9
	
	*/
	
	public static void main(String[] args){
		for(int i=1;i<=3;i++){
			for(int s=3;s>i;s--){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				int n=i*3;
				System.out.print(n+" ");
			}
			System.out.println();
		}
	}
}