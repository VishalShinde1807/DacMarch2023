class Eleven{
    public static void main(String[] args){
        char ch=args[0].charAt(0);

        if(Character.isDigit(ch)){
            System.out.println(ch);
            String str=String.valueOf(ch);
            int codePoint =str.codePointAt(0);
            System.out.println("codepoint:"+codePoint);
        }
        else
             if(Character.isLowerCase(ch)){
                char c1=Character.toUpperCase(ch);
                System.out.println("Uppercase character:"+c1);
                String str=String.valueOf(c1);
                int codePoint =str.codePointAt(0);
                System.out.println("codepoint:"+codePoint);
             }
             else{
                char c2=Character.toLowerCase(ch);
                System.out.println("Lowercase character:"+c2);
                String str=String.valueOf(c2);
                int codePoint =str.codePointAt(0);
                System.out.println("codepoint:"+codePoint);
             }

    }
}