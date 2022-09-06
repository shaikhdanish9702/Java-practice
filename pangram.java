import java.util.Scanner;

import javax.swing.text.StyledEditorKit.BoldAction;

import javafx.scene.chart.StackedAreaChart;

public class pangram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        allletter(str);

    }
    static void allletter(String str){
       str.toLowerCase();
       boolean allletterpresent=true;
       for(char ch='a';ch<'z';ch++){
           if(!str.contains(String.valueOf(ch))){
               allletterpresent=false;
           }
       }
        
        if(allletterpresent){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
