
class Twenty_One{
    public static void main(String[] args){
        long Num=89745l;
        Long l1=new Long(Num);         //Byte value

        byte num1=l1.byteValue();    //instance method so called on object reference
        System.out.println("num1:"+num1);

        short num2=l1.shortValue();
        System.out.println("num2:"+num2);
        
        int num3=l1.intValue();
        System.out.println("num3:"+num3);

        long num4=l1.longValue();
        System.out.println("num4:"+num4);

        float num5=l1.floatValue();
        System.out.println("num5:"+num5);

        double num6=l1.doubleValue();
        System.out.println("num6:"+num6);
    }
}