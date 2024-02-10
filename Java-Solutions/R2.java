public class R2 {
    public static void main(String[] args) {
        int Arr[] = new int[]{1,5,15,18,26,72,75,81};
        for(int i=0;i<=Arr.length-1;i++)
        {
            if(Arr[i]%3==0 && Arr[i]%2!=0)
                System.out.println(Arr[i]);
        }
    }
    
}
