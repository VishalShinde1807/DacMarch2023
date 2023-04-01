class seventeen{
    public static void main(String[] args){
        int Num=6547;
        Integer n1=new Integer(Num);         //Byte value

        byte num1=n1.byteValue();    //instance method so called on object reference
        System.out.println("num1:"+num1);

        short num2=n1.shortValue();
        System.out.println("num2:"+num2);
        
        int num3=n1.intValue();
        System.out.println("num3:"+num3);

        long num4=n1.longValue();
        System.out.println("num4:"+num4);

        float num5=n1.floatValue();
        System.out.println("num5:"+num5);

        double num6=n1.doubleValue();
        System.out.println("num6:"+num6);
    }
}