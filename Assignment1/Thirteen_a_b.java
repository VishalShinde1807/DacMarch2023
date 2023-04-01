class Thirteen_a_b{
    public static void main(String[] args){

        //short value into String
       short num=50;
       String str=Short.toString(num);
       System.out.println(str);

         //short value into Short instance
       Short number=Short.valueOf(num);
        System.out.println(number);
    }
}