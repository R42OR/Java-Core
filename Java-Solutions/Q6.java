public class Q6 {
    public static void main(String[] args) {
        int arr[] = {2,4,9,5,1,0,2,2,1,5};
        int above=0,below=0;

        for(int i = 0;i<=arr.length-1;i++)
        {
            if(arr[i]<3)
            above=above+arr[i];

            else if(arr[i]>3)
            below=below+arr[i];
        }

        System.out.println("Above 3 = "+ above + " and Below 3 = "+ below);
    }
}
