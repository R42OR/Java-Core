public class p4 {
    public static void main(String [] args)
    {
        // int n = 7;
        // int fact=1;
        // for(int i=1;i<=n;i++)
        // {
        //     fact = fact * i;
        // }
        // System.out.println(fact);

        // int n = 5;
        // String str="";
        // int temp=n;
        // for(int i=1;i<=n;i++)
        // {   
        //     str = str + temp;
        //     temp=temp-1;
        //     System.out.println(str);
         // }
         // 1
            // 12
            // 2
            // 21

        // int n = 7, temp = 0;
        // String str = "", str1 = "";
        // for(int i = 1;i<=(n*2);i++)
        // {   if(i<=n)
        //     {
        //         str = str + i;
        //         System.out.println(str);
        //     }

        //     else
        //     {  
                

        //         str1 = str1 + String.valueOf(n-temp);
        //        System.out.println(str1);
        //        temp++;
                
        //     }

            
        // }


        int x=17,y=5, pow = x;
        for(int i=1;i<=y;i++)
        {
            System.out.print(pow+" # ");
            
            pow = x;
            for(int j = 1;j<=i;j++)
            {
                pow=pow*x;
            }
        }
        


        
    }
}
