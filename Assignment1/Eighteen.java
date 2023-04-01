class Eighteen{
    public static void main(String[] args){
        int n1=245;
        int n2=987;
        int num1=Integer.max(n1,n2);
        int num2=Integer.min(n1,n2);
        int sum=Integer.sum(n1,n2);
        System.out.println("Maximum number is:"+num1);
        System.out.println("Minimum number is:"+num2);
        System.out.println("Sum of n1 and n2 is:"+sum);
    }
}