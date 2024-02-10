public class M2 {
    public static void main(String[] args) {
        // String str = "ABCD", Str1="";

        // for(int i = 0;i<str.length();i++)
        // {
        //     Str1= Str1 + str.charAt(i);
        //     System.out.print(Str1+"#");
        // }
        // String Str = "dada", start="";
        // for(int i =0;i<Str.length()/2;i++)
        // {
        //    start += Str.charAt(i);
        // }
        // if(Str.equals(start+start))
        //     System.out.println("Yes");
        // else 
        //     System.out.println("No");
         

        // String str="JOb Ready Java ", str1="";
        // char ch='i';
        //  for(int i=0;i<str.length();i++)
        //  {
            
        //     ch=str.charAt(i);
        //     str1+=ch;
            
        //     if(ch == ' ')
        //     {
        //         System.out.println(str1);
        //         str1="";
        //     }

            
        //  }
        
        
        int ascii;
        String str = "HellOz";
        for(int i = 0;i<str.length();i++)
        {
            ascii = str.charAt(i);
            if(ascii<=90)
                System.out.print((char) ascii);

            else
                System.out.print((char) (ascii-32));
        }
    }
}
