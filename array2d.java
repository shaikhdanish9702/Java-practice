import java.util.Scanner;

import javafx.application.Preloader.StateChangeNotification;

public class array2d {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=sc.nextInt();
        int arr[][]=new int[n][s];
        for(int i=0;i<n;i++){
            for(int j=0;j<s;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        diagoba(arr, n, s);
        for(int i=0;i<n;i++){
            for(int j=0;j<s;j++){
                System.out.print(arr[i][j]+" ");
            }System.out.print("\n");
        }

    }
        static void diagoba(int arr[][],int n,int s){
            for(int line=1;line<=(n+s-1);line++){
                int startcols=max(0,line-n);
                int count=min(line,(s-startcols),n);
                for(int j=0;j<count;j++){
                    System.out.println(arr[min(n,line)-j-1][startcols+1]+" ");
                }System.out.println();
            }
        }
    
        static int min(int a,int b){
            return(a<b)?a:b;
        }
        static int min(int a,int b,int c){
            return min(min(a, b),c);
        }
        static int max(int a,int b){
            return(a>b)?a:b;
        }
}


