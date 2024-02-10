public class R1 {
    public static void main(String[] args) {
        int[] Arr = new int[]{12,10,100,0,19,0};
        int Arr1[] = new int[10];
        int j = 0;
        for(int i = 0;i<=(Arr.length)-1;i++)
        {
            if(Arr[i]!=0)
            {
                Arr1[j]=Arr[i];
                j++;
            }
        }
        for(int i=0;i<=Arr1.length-1;i++)
        {
            if(Arr1[i]==0)
                break;
            System.out.println(Arr1[i]);
        }
    }
    
}
