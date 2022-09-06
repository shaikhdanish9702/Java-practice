import java.util.LinkedList;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class linklist {
    public static void main(String[] args) {
        LinkedList<String> list= new LinkedList<String>();

        list.add("a");
        list.add("is");
        list.addFirst("last");
        list.add("e");
        list.add(2, "u");
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
    }
}
