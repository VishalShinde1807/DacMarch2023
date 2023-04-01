class Twenty_Six{
    public static void main(String[] args){
        float n1=245.0235f;
        float n2=1987.3698f;
        float num1=Float.max(n1,n2);
        float num2=Float.min(n1,n2);
        float sum=Float.sum(n1,n2);
        System.out.println("Maximum number is:"+num1);
        System.out.println("Minimum number is:"+num2);
        System.out.println("Sum of n1 and n2 is:"+sum);
    }
}