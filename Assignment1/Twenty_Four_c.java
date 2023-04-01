class Twenty_Four_c{
    public static void main(String[] args){
        
        //String instance into Float instance
        String str=new String("5698.241");
        float num1=Float.parseFloat(str);
        float num2=Float.valueOf(num1);
        System.out.println(num2);
    }
}