//Write a program to convert state of Byte instance into byte, 
//short, int, long, float and double.


class Nine{
    public static void main(String[] args){
        byte Num=65;
        Byte b1=new Byte(Num);         //Byte value

        byte num1=b1.byteValue();    //instance method so called on object reference
        System.out.println("num1:"+num1);

        short num2=b1.shortValue();
        System.out.println("num2:"+num2);
        
        int num3=b1.intValue();
        System.out.println("num3:"+num3);

        long num4=b1.longValue();
        System.out.println("num4:"+num4);

        float num5=b1.floatValue();
        System.out.println("num5:"+num5);

        double num6=b1.doubleValue();
        System.out.println("num6:"+num6);
    }
}