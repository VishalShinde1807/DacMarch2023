class Twenty_Eight_a_b{
    public static void main(String[] args){
       double num=846.317;
       
        //double value into String
        String str=Double.toString(num);
        System.out.println(str);

       //double value into Double instance
       double number=Double.valueOf(num);
       System.out.println(number);
    }
}