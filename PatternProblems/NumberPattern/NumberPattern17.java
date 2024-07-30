public class NumberPattern17{
	public static void main(String[] args){
	    for(int i=3;i>=1;i--){
			for(int s=3;s>i;s--){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				int n=i*2;
				System.out.print(n+" ");
			}
			System.out.println();
	    }
	}
}