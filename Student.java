import java.util.*;

class Student {
    int rollno;
    String name;
    String address;
    public Student(int rollno,String name,String address){
        this.rollno=rollno;
        this.name=name;
        this.address=address;
    }
}
public class ComparatorList{
    public static void main(String[] args) {
       Student arr[]=new Student[5];
       arr[0]=new Student(1,"dilip","mumbai");
       arr[1]=new Student(2,"dil","mumbai");
       arr[2]=new Student(9,"dip","mumbai");
       arr[3]=new Student(4,"lip","mumbai");
       arr[4]=new Student(5,"diip","mumbai");
       Arrays.sort(arr,new custom());
       for(int i=0;i<arr.length;i++){
           System.out.println(arr[i].rollno+" "+arr[i].name+" "+arr[i].address);
       }
    }
}
class custom implements Comparator<Student>{
    public int compare(Student s1,Student s2){
        return s1.rollno-s2.rollno;
    }
}
