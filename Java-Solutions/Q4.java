public class Q4 {
    public static void main(String[] args) {
    //     String st="digital", st1="";
    //     char cd= 'a';


    // for(int i=0;i<=(st.length())-1;i++){
    //   cd = st.charAt(i);
    //   if(cd=='d')
    //   {
    //     st1=st1+ (char) cd+"d";
    //   }
    //   else 
    //   {
    //     st1 = st1 + (char) cd;
    //   }
    
    // }
    // System.out.println(st1);
    

        // String str = "EArth is Heavan", str1="";
        // char ch ='a';
        // for(int i = 0; i<=str.length()-1;i++)
        // {   ch = str.charAt(i);
        //     if(ch=='a')
        //     str1=str1+"aaa";

        //     else if(ch=='A')
        //     str1=str1+"AA";

        //     else
        //     str1=str1+ch;

        // }
        // System.out.println(str1);

        String Str="ShUbRinIrNsdDa jhgjAhR",Str1="";
        char ch=' ';
        for(int i=0;i<=Str.length()-1;i++)
        {
            ch = Str.charAt(i);
            if(ch>='A' && ch<='Z')
            Str1=Str1+ch;


            
        }
        System.out.println(Str1);

    }
}
