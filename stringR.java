public class stringR {
    public static void main(String[] args) {
        String str="My name is Danish";
        String []str1=str.split(" ");
        for(int i=0;i<str1.length;i++){
            System.out.print(swapString(str1[i])+" ");
        }
    }

    public static String swapString(String str){
       char[] c=str.toCharArray();
       char temp=c[0];
       c[0]=c[c.length-1];
       c[c.length-1]=temp;
       return String.valueOf(c);
    }
}
