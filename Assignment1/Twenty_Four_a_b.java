class Twenty_Four_a_b{
    public static void main(String[] args){
     float num=56.3214f;

    //float value into String
     String str=Float.toString(num);
     System.out.println(str);

   //float value into Float instance
       float number=Float.valueOf(num);
       System.out.println(number);
}
}