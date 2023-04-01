class Twenty_Two{
    public static void main(String[] args){
        long n1=2456l;
        long n2=1987l;
        long num1=Long.max(n1,n2);
        long num2=Long.min(n1,n2);
        long sum=Long.sum(n1,n2);
        System.out.println("Maximum number is:"+num1);
        System.out.println("Minimum number is:"+num2);
        System.out.println("Sum of n1 and n2 is:"+sum);
    }
}