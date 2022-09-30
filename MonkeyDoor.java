import java.util.Arrays;

class MonkeyDoor{
    public static void main(String[] args) {
        int n=100;
        boolean door[]=new boolean[100+1];
        Arrays.fill(door,true);

        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                if(i%j==0){
                    if(door[j]){
                        door[j]=false;
                    }else{
                        door[j]=true;
                    }
                }else{
                    if(door[j]){
                        door[j]=false;
                    }else{
                        door[j]=true;
                    }

                }
            }
            
        }


int z=1;
        for(int i=0;i<n;i++){
            if(door[i]){
            System.out.println(door[i] +" "+ z);
            z++;
        }
    }
    }
}