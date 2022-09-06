import java.util.*;

import javafx.scene.Node;

public class linkedlistsecond {
    public static void main(String[] args) {
        List<Integer> l=new LinkedList<Integer>();
        l.add(0);
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(100);
        l.add(6);
        l.add(7);
        int big=0;
        int small=0;
        int i=0;
        while(i<l.size()){
            if(big<l.get(i)){
                small=big;
                big=l.get(i);
            }
            else if(small<l.get(i) && big!=l.get(i)){
                small=l.get(i);
            }
            i++;
        }
        int x=big+small;
        System.out.println(small+"+"+big+"="+x);
    }
}
