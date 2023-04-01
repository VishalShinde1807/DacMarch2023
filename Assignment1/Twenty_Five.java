class Twenty_Five{
    public static void main(String[] args){
        float Num=574.0236f;
        Float f1=new Float(Num);         //Byte value

        byte num1=f1.byteValue();    //instance method so called on object reference
        System.out.println("num1:"+num1);

        short num2=f1.shortValue();
        System.out.println("num2:"+num2);
        
        int num3=f1.intValue();
        System.out.println("num3:"+num3);

        long num4=f1.longValue();
        System.out.println("num4:"+num4);

        float num5=f1.floatValue();
        System.out.println("num5:"+num5);

        double num6=f1.doubleValue();
        System.out.println("num6:"+num6);
    }
}