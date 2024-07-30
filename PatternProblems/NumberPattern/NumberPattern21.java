public class NumberPattern21{
	
	
	public static void main(String[] args){
		int num=1;
	int rows=5;
	for(int i=1;i<=rows;i++){
		int temp=num;
		for(int j=1;j<=i;j++){
			System.out.print(temp+" ");
			temp=temp+rows-j;
		}
		num++;
		System.out.println();
	}
	}
	
}