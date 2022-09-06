import java.io.*;//forhandlinginput/output
import java.util.*;//containsCollectionsframework
//don'tchangethenameofthisclass
//youcanaddinnerclassesifneeded
class Main{
        public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        
        for(int i=0;i<t;i++){
        int N=sc.nextInt();
        int[] arr=new int[N];
        for(int j=0;j<N;j++){
        arr[j]=sc.nextInt();
        }
        int n=arr.length;
        
        quickSort(arr,0,n-1);
        printArray(arr,n);
        }
        }

static void swap(int[]arr,int i,int j)
        {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        }
static int partition(int[]arr,int low,int high)
        {
        
        
        int pivot=arr[high];
        int i=(low-1);

        for(int j=low;j<=high-1;j++)
        {
        

        if(arr[j]<pivot)
        {
        
        i++;
        swap(arr,i,j);
        }
        }
        swap(arr,i+1,high);
        return(i+1);
        }


static void quickSort(int[]arr,int low,int high)
        {
        if(low<high)
        {
        
        int pi=partition(arr,low,high);

        quickSort(arr,low,pi-1);
        quickSort(arr,pi+1,high);
        }
        }

static void printArray(int[]arr,int size)
        {
        for(int i=size-1;i>size-4;i--)
        System.out.print(arr[i]+" ");
        System.out.println();
        }

        }