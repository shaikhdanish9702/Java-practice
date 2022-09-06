import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import javafx.stage.StageStyle;

public class searchDataInLinkedList {
    public static void main(String[] args) {
        List<Integer> l=new LinkedList<Integer>();
        l.add(0);
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(7);
        System.out.println(l);
        l.size();
        int target=4;
        boolean find=false;
        int i=0;
        int pos=0;
        while(i<l.size()){
            if(l.get(i)==target){
                find=true;
                pos=i;
                break;
            }
            i++;
        }
        if(find){
            System.out.println("target found= "+ (pos+1));
            
        
        }else{
            System.out.println("target not found");
        }
       
      }
}
