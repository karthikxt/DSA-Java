public class StarPattern1{

	/*
	
	
	*            *
	**          **
	***        ***
	****      ****
	*****    *****
	******  ******
	*****    *****
	****      ****
	***        ***
	**          **
	*            *
	
	
	*/
	public static void main(String[] args){
		for(int i=1;i<6;i++){
			for(int j=1;j<=i;j++){  //increasing
				System.out.print("*");
			}
			for(int j=i;j<=6;j++){   //decreasing
				System.out.print(" "); 
			}
			for(int j=i;j<=6;j++){   //decreasing
				System.out.print(" "); 
			}
			for(int j=1;j<=i;j++){   //increasing
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		
		for(int i=1;i<=6;i++){    
 			for(int j=6;j>=i;j--){    //decreasing
				System.out.print("*");
			}
			for(int j=1;j<=i;j++){  //increasing 
				System.out.print(" "); 
			}
			for(int j=1;j<=i;j++){   //increasing
				System.out.print(" "); 
			}
			for(int j=6;j>=i;j--){   //decreasing
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
}
