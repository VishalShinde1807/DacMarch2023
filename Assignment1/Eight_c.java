class Eight_c{
    public static void main(String[] args){
       
       String str=new String("123");      //string instance
       //byte b1=Byte.parseByte(str);       //unboxing
       byte b2=Byte.valueOf(str);           //
       System.out.println(b2);
    }
}