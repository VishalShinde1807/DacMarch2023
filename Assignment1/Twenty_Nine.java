class Twenty_Nine{
    public static void main(String[] args){
        double Num=8761567;
        Double d1=new Double(Num);         //Byte value

        byte num1=d1.byteValue();    //instance method so called on object reference
        System.out.println("num1:"+num1);

        short num2=d1.shortValue();
        System.out.println("num2:"+num2);
        
        int num3=d1.intValue();
        System.out.println("num3:"+num3);

        long num4=d1.longValue();
        System.out.println("num4:"+num4);

        float num5=d1.floatValue();
        System.out.println("num5:"+num5);

        double num6=d1.doubleValue();
        System.out.println("num6:"+num6);
    }
}