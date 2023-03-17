/*
A
B B
C C C
D D D D
E E E E E
*/

class Pattern5{
   public static void main(String args[]){
   
   char u=64;
   for(int i=1;i<=5;i++){
		  for(int j=1;j<=i;j++){
			  System.out.printf("%c ",u+i);
		  }
		  System.out.println();
	  }
   }
}