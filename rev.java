public class rev {
    public static void main(String[] args) {
        String str="the newton school to mumbai";
        String []result=str.split(" ");
        String re="";
        for(int i=result.length-1;i>=0;i--){
            re+=result[i]+" ";
        }
        System.out.println(re);
    }
}
