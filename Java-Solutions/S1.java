public class S1 {

    public void square(int x)
    {
        int sq = x*x;
        System.out.println(sq);
    }

    public void cube(int x)
    {
        int cb= x*x*x;
        System.out.println(cb);
    }

    public static void main(String[] args) {
        // int a = 9;
        // S1 obj = new S1();
        // obj.square(a);
        
        int Arr[] = {3,2,4,6,8};
        S1 obj = new S1();
        for(int i=0;i<=Arr.length-1;i++)
        {
            obj.square(Arr[i]);
            obj.cube(Arr[i]);
        }
    
    }
    
}
