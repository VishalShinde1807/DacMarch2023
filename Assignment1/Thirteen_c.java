class Thirteen_c{
    public static void main(String[] args){
        //String instance into Short instance
        String str=new String("1234");
        short num1=Short.parseShort(str);
        Short num2=Short.valueOf(num1);
        System.out.println(num2);
    }
}