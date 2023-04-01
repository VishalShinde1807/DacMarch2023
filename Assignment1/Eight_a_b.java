class Eight_a_b{
    public static void main(String[] args){
        byte num=25;

        //byte value into String

        //String s1=String.valueOf(num);
        String str=Byte.toString(num);
             System.out.println(str);

        //byte value into Byte instance.
        byte b2=Byte.valueOf(b1);
        System.out.println(b2);
    }
}