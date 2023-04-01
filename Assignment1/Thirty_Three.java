class Thirty_Three{
    public static void main(String[] args){
        int Num=Integer.parseInt(args[0]);
        float num1=Float.parseFloat(args[1]);
        double num2=Double.parseDouble(args[2]);
        
        double result=0;
        switch(Num){
            case 1:
            result =num1+num2;
            break;
            
            case 2:
            result =num1-num2;
            break;
            
            case 3:
            result =num1*num2;
            break;
            
            case 4:
            result =num1/num2;
            break;


        }
        System.out.println(result);

        
    }
}