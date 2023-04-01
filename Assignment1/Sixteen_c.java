class Sixteen_c{
    public static void main(String[] args){
        //String instance into Integer instance
        String str=new String("1234");
        int num1=Integer.parseInt(str);
        int num2=Integer.valueOf(num1);
        System.out.println(num2);
    }
}