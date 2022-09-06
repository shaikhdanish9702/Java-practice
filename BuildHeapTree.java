public class BuildHeapTree {
    public static void main(String[] args) {
        int arr[] = {10, 5, 3, 2, 4 };
        int n = 9;
        int k=15;
        insertNode(arr, n, k);
        print(arr,n);
    }
    public static void print(int arr[],int n) {
        for(int i=0;i<n;++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    public static int delroot(int arr[],int n) {
        int last=arr[n-1];
        arr[0]=last;
        n=n-1;
        heapify(arr, n, 0);
        return n;
    }
    public static void insertNode(int arr[],int n,int k) {
        n=n+1;
        arr[n-1]=k;
        heapify(arr, n, n-1);
    }
    public static void BuildHeap(int []arr,int n) {
        int start=(n/2)-1;
        for(int i=0;i<start;i++){
            heapify(arr,n,i);
        }
    }
    public static void heapify(int arr[],int n,int i) {
        int large=i;
        int l=2*i+1;
        int r=2*i+2;
        if(l<n && arr[l]>arr[large]){
            large=l;
        }
        if(r<n && arr[r]>arr[large]){
            large=r;
        }
        if(large!=i){
            int temp=arr[i];
            arr[i]=arr[large];
            arr[large]=temp;
        
        heapify(arr, n, large);
    }
}
}