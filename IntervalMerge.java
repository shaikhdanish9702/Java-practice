import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;

public class IntervalMerge {
    public static void merge(List<Interval>itr) {
        Collections.sort(itr,Comparator.comparingInt(a->a.begin));
        Stack<Interval>stack=new Stack<>();
        for(Interval curr:itr){
            if(stack.empty() || curr.begin>stack.peek().end){
                stack.push(curr);
            }
            if(stack.peek().end <curr.end){
                stack.peek().end=curr.end;
            }
        }
        while(!stack.empty()){
            System.out.println(stack.pop());
        }
    }
    
    public static void main(String[] args) {
        List<Interval> itr=Arrays.asList(new Interval(1, 5),new Interval(2, 3),new Interval(4,6),new Interval(7, 8),new Interval(8,10),new Interval(12, 15));

        merge(itr);
    }
}
class Interval{
int begin;
    int end;
    Interval(int begin,int end){
        this.begin=begin;
        this.end=end;
    }
    public String toString(){
        return "{"+begin+","+end+"}";
    }

}