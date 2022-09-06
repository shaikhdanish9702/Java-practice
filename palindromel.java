public class palindromel {
    public static void main(String[] args) {
        String str="abba";
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev=str.charAt(i)+rev;
        }
        if(str.equals(rev)){
            System.out.println("this word is palindrome");
        }else{
            System.out.println("this word is not palindrome");
        }
    }
}
