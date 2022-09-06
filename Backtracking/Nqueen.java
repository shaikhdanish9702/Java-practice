class Nqueen{
    public static void main(String[] args) {
        int n=10;
        int arr[][]=new int[n][n];
        if(solve(arr, 0)){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }System.out.println();
        }
    
    }else{
        System.out.println("false");

    }
    }
    public static boolean valid(int arr[][],int x,int y) {
        for(int row=0;row<x;row++){
            if(arr[row][y]==1)
            return false;
        }
        int row=x;
        int col=y;
        while(row>=0 && col>=0){
            if(arr[row][col]==1){
                return false;
            }
            col--;
            row--;
        }
        row=x;
        col=y;
        while(row>=0 && col>=arr.length){
            if(arr[row][col]==1){
                return false;
            }
            col++;
            row--;
        }
        return true;
    }
    public static boolean solve(int arr[][],int row){
        if(row==arr.length)
        return true;
        for(int col=0;col<arr.length;col++){
            if(valid(arr, row, col)){
            arr[row][col]=1;
            if(solve(arr, row+1))
            return true;
            arr[row][col]=0;
        }
    }
    return false;
    }  
}