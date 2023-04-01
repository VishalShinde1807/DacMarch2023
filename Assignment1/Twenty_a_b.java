class Twenty_a_b{
    public static void main(String[] args){
        long num=8964L;

        //long value into String
        String str=Long.toString(num);
        System.out.println(str);

        // long value into Long instance
         long number=Long.valueOf(num);
        System.out.println(number);
    }
}