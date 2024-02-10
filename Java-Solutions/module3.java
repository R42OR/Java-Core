class module3{
    public static void main(String[] args)
    {
        /*int n=17;
        if(n%2==0)
        {
            System.out.println("Trisect");
        }
        else
            System.out.println("Institute");*/


        /*
        int n = 5;

        for(int i=1;i<=n;i++)
        {
            if (i%3==0)
            System.out.println("pepsi - "+i);

            else
            System.out.println("Cock - "+i);
        }
        */
        /**/
        int n=5;
 
        for(int i=2;i<=n+1;i++)
        {
            System.out.print((n*i)+"#");
        }

        //int n=5;
        for(int i=n*2;i>=0;i--)
        { 
            if(i>=n)
            {System.out.println("#");}

            else
            {  
                System.out.println(i+1);

            }
        }
    } 
}