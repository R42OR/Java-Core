

public class Q5{
    public static void main(String[] args) {

        int[] Arr = new int[]{ 1,2,3,4,5,6,7,8};
        int Arr1[] = new int[Arr.length];

        for(int i=0;i<=Arr.length-1;i++)
        {
            Arr1[i]=Arr[i]*10;
        }

        for(int i=0;i<=Arr1.length-1;i++)
        {
            System.out.println(Arr1[i]);
        }
        
    }

}