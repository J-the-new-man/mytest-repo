public class BinarySearch{
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,5,6,78,9,} ;
        int target = 5 ;

        System.out.println(binarySearch(nums , target));
    }
    static int binarySearch(int[] arr ,int target){
        int start = 0 ;
        int end = arr.length -1 ;

        while(start<=end){
            int mid = start + (end-start)/2 ;
            if(target>arr[mid]){
                start = mid + 1 ;
            
            }
            if(target<arr[mid]){
                end = mid - 1 ;
             
            }
            if(target==arr[mid]){
                return mid ;
            }
        }


        return -1 ;

    }
}