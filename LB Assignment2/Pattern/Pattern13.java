/*
    A
   B B
  C C C
 D D D D
E E E E E
*/
class Pattern13{
   public static void main(String args[]){
     char u=64;
       for(int i=1;i<=5;i++){
	       for(int j=5;j>i;j--){
		      System.out.print(" ");
		   }
		   for(int k=1;k<=i;k++){
		   	  System.out.printf("%c ",u+i);
		   }
		   	   System.out.println();
	   }   
   }
   
}