class Twenty_c{
    public static void main(String[] args){
        //String instance into Long instance
        String str=new String("1234");
        long num1=Long.parseLong(str);
        long num2=Long.valueOf(num1);
        System.out.println(num2);
    }
}