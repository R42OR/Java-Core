import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class S10 {
    public static void main(String[] args) {
        // int Arr1[]={1,2,25,30,35,51};
        // int Arr2[]={1,2,3,4};
        // int count=0;

        // ArrayList<Integer> numbers = new ArrayList<>();
        // for(int i = 0; i<Arr1.length+Arr2.length-1;i++)
        // {
        //     if(i<Arr1.length)
        //         numbers.add(Arr1[i]);
            

        //     else
        //         numbers.add(Arr2[i-5]);
        // }
        // System.out.println(numbers);

        HashSet<Integer> set = new HashSet<>();
        int Arr[]={1,3,5,7,9,4,7,11,9};

        for(int i= 0; i<Arr.length; i++)
        {
            set.add(Arr[i]);
        }
        System.out.println(set);

    }
    
}
