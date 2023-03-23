/*
     E
    D E
   C D E
  B C D E
 A B C D E
*/
class Pattern10{
	public static void main(String args[]){
		int character=64;
		for(int i=5;i>=1;i--){
			
			for(int k=i;k>=1;k--){
				System.out.print(" ");
			}
			for(int j=i;j<=5;j++){
				System.out.print((char)(character+j)+" ");
			}
		 System.out.println();
		}
	}
}