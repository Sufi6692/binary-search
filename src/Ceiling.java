public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};

        int target =17;
        int ans = ceiling(arr,target);
        System.out.println(ans);

    }
// return the index of smallest no >= target
    static int ceiling(int []arr,int target ){
        //but what if the target is greater than the greatest number in the array
        if(target > arr[arr.length-1]){
            return -1;
        }
        int start =0;
        int end = arr.length-1;

        while (start <= end){
            // find the middle element
 // int mid = (start + end) /2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end-start)/2;
            if (target<arr[mid]){
                end = mid-1;
            }else if(target>arr[mid]){
                start= mid+1;
            }else {
                return mid;
            }
        }
        return start;
    }
}
