class Twenty_Eight_c{
    public static void main(String[] args){
        
        //String instance into Double instance
        String str=new String("65798.241");
        double num1=Double.parseDouble(str);
        double num2=Double.valueOf(num1);
        System.out.println(num2);
    }
}