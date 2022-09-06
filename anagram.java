import java.util.*;
public class anagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char str1[]={'r','r','e','e'};
        char str2[]={'r','e','e','i'};
        if(ana(str1, str2))
            System.out.println("the char are anagram");
        else
        System.out.println("the char are not anagram");
    }
    static boolean ana(char str1[],char str2[]){
        int n1=str1.length;
        int n2=str2.length;
        Arrays.sort(str2);
        Arrays.sort(str1);
        if(n1 != n2)
            return false;
        for(int i=0;i<n1;i++)
            if(str1[i] != str2[i])
                return false;
        return true;
    }
}
