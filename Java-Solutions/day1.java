
class Main {
   public static void main(String[] args) {
/*
      int n=4;
      int sum =0;

      for(int i = 1; i<=n; i++)
      {
         sum = sum + (i*i*i*i);
      }
      System.out.println(sum);
*/
     
    /* 
     i=1 ==  sum = 0+ 1
    */
    /* 
      int n=5;
      int product=1;
      for(int i=1;i<=n;i++)
      {
         product = product * i;
      }
      System.out.println(product);
     */
/*
     int n = 6;

     for(int i=1;i<=10;i++)
     {
      System.out.println(n+ " x " + i + " = " + (n*i));
     }

     i=0 == pat = *
     i=1 == pat = **
     i=2 == pat = ***



     */
      String pat = "";
     for(int i=0;i<3;i++)
     {
      pat = pat + "*";
      System.out.println(pat);
     }
   
   
   }
 }