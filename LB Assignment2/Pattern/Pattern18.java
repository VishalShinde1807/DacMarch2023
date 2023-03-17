/*
A B C D E
A B C D
A B C
A B
A
*/

class Pattern18{
	public static void main(String args[]){
		char u=64;
		for(int i=5;i>=1;i--){
			for(int j=1;j<=i;j++){
				System.out.printf("%c ",u+j);
			}
			System.out.println();
		}
	}
}