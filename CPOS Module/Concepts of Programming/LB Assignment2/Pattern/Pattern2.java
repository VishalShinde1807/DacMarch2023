/*
A
A B
A B C
A B C D
A B C D E
*/

class Pattern2{
   public static void main(String args[]){
   
   char u=64;
   for(int i=1;i<=5;i++){
		  for(int j=1;j<=i;j++){
			  System.out.printf("%c ",u+j);
		  }
		  System.out.println();
	  }
   }
}