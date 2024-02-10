public class S6 {

    public void moveChar(String st, char chr)
    {
        char temp;
        String str1="" ,st1="";
        for(int i=0;i<st.length();i++)
        {
            temp = st.charAt(i);

            if(temp == chr)
                str1 = str1  + temp;

            else
                st1 = st.replace("l" ,"");
        }
        System.out.println(st1+str1);

    }

    public static void main(String[] args) {
        String str = "hello";
        char ch = 'l';

        S6 obj = new S6();

        obj.moveChar(str,ch);
    }
    
}
