import java.util.Arrays;

public class Swap {
    public static int[] reverse(int[] arr)
    {
        int start =0;
        int end=arr.length-1;
        while(start<end)
        {
            swap(arr,start++,end--);
        }
        return arr;
    }

    public static void swap(int[] arr, int index1, int index2)
    {
        int temp =arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
    
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        System.out.println(Arrays.toString(reverse(arr1)));
    }
}
