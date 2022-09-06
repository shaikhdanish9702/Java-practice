public class Uppercase {
    public static void main(String[] args) {
        String str="Bhishek awant";
        String str1[]=str.split(" ");
        String temp=str1[1];
            if(upeString(str1[0])){
                temp=str1[1].toUpperCase();
            }
            if(upeString(str1[1])){
                str1[0]=str1[0].toUpperCase();
            }
            str1[1]=temp;
            for(int i=0;i<str1.length;i++){
            System.out.print(str1[i]+" ");
            }
    }
    public static boolean upeString(String str){
        if(str.charAt(0)>=65 && str.charAt(0)<=90)

        return true;
    
    return false;
    }
}
// String Question : For an input of name , check if first letter of first name is in caps then convert entire last name to Upper Case.
// Check if first letter of last name is in Upper case then convert entire first name to upper case 
// Example : Abhishek sawant --> Abhishek SAWANT 
// abhishek Sawant--> ABHISHEK Sawant 
// Abhishek Sawant --> ABHISHEK SAWANT\

