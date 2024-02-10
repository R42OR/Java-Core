public class S2 {
    public static void main(String[] args) {
        // int n = 4;
        // String str = "", str1 = "";
        // for(int i=0;i<n;i++)
        // {
        //     str = str + '*' ;
        // }

        // for(int i =1; i<=n ;i++)
        // {
        //     str1=str1 + str + i;
        //     System.out.println(str1);
        // }
        
        String str = "hello",str1="";
        char ch;

        for(int i=0;i<str.length();i++)
        {

            ch = str.charAt(i);
            str1= ch + "#" + str1;
            

        }
        System.out.println(str1+str+"#");

        
    }
    
}


