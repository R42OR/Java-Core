public class S4 {
    public static void main(String[] args) {
        String str="tool", first="", second="";
        char ch;
        for(int i = 0;i<str.length();i++)
        {
            ch=str.charAt(i);
            if(i<str.length()/2)
                first = first + ch;

            else
                second = second + ch;

        }
        System.out.println( second + "#" + str + "#" +first );
    }
    
}
