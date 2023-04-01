
class Fourteen{
    public static void main(String[] args){
        short Num=289;
        Short s1=new Short(Num);         //Byte value

        byte num1=s1.byteValue();    //instance method so called on object reference
        System.out.println("num1:"+num1);

        short num2=s1.shortValue();
        System.out.println("num2:"+num2);
        
        int num3=s1.intValue();
        System.out.println("num3:"+num3);

        long num4=s1.longValue();
        System.out.println("num4:"+num4);

        float num5=s1.floatValue();
        System.out.println("num5:"+num5);

        double num6=s1.doubleValue();
        System.out.println("num6:"+num6);
    }
}