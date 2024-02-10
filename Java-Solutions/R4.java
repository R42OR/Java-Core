public class R4 {
    public static void main(String[] args) {
        // String str = "Hell34O6575", str1 = "";
        // char ch;
        // for(int i = 0;i<=str.length()-1;i++)
        // {   ch=str.charAt(i);
        //     if(ch>='A' && ch<='Z')
        //     {
        //         str1=str1+ch+ch;
        //     }
        //     else if(ch>='0' && ch<='9')
        //     {
        //         str1=str1+'#';
        //     }
        //     else
        //         str1=str1+ch;
        // }
        // System.out.println(str1);

        // String str = "who", str1 ="";
        // char ch;
        // int len=str.length();
        
        // for(int i=0;i<=len+len;i++)
        // {
            
        //     if(i>len)
        //     {
        //         ch=str.charAt(i-len-1);
        //         str1=ch+str1;
        //     }
              
            
        //     else if(i<len)
        //     {
        //         str1="#"+str;
        //     }  


        // }
        // System.out.println(str1);


        // String str = "java", str1="";
        // for(int i=1;i<=str.length();i++)
        // {
        //     str1=str1+ "*" ;
        //     System.out.println(str1+ str.charAt(i-1));
        // }
        
        int Arr[] = {1,5,15,20,27,72,75,150,400};
        for(int i = 0;i <= Arr.length-1;i++)
        {
            if(Arr[i]>=0 && Arr[i]<=99)
            {
                if((Arr[i]%3==0 || Arr[i]%4==0) && Arr[i]%12!=0 )
                    System.out.println(Arr[i]);

            }
        }
    }
}
