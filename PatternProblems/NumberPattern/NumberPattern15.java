public class NumberPattern15{
	public static void main(String[] args){
		for(int i=1;i<=9;i++){
			for(int j=1;j<=3;j++){
				System.out.print(i);
				i++;
			}
			i--;
			System.out.println();
		}
	}
}