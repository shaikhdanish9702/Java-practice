public class interviewQuestion {
    public static void main(String[] args) {
        int arr[]= {2,3,4,6,8,10,12,14,56};
        int n= arr.length;
        int x=10;
        
        System.out.println(binarySearch(arr,0,n-1,x));

    } 
    static int binarySearch(int arr[],int left,int right,int x){
        if(right>=left){
            int mid=left+(right-left)/2;
            if(arr[mid]==x){
                return mid;
            }
            if(arr[mid]>x){
                return binarySearch(arr,left,mid-1,x);
            }
            if(arr[mid]<x){
                return binarySearch(arr,mid+1,right,x);
            }

        }return -1;
    }
}
