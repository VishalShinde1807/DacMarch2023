class Thirty{
    public static void main(String[] args){
        double n1=2443.7431967;
        double n2=96464.123648;
        double num1=Double.max(n1,n2);
        double num2=Double.min(n1,n2);
        double sum=Double.sum(n1,n2);
        System.out.println("Maximum number is:"+num1);
        System.out.println("Minimum number is:"+num2);
        System.out.println("Sum of n1 and n2 is:"+sum);
    }
}