public class EvenOddSortLinkedList {
   
        public static void main(String[] args) {
            System.out.println("Welcome to Online IDE!! Happy Coding :)");
            MyList list = new MyList();
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(4);
            list.add(5);
            list.add(6);
            list.display();
            list.rev();
            list.display();
        }
    }
    
    class MyList{
    
    class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
        }
    }
    Node head;
    int size;
    //    public MyList() {
    //         size = 0;
    //     }
        public Node add(int data) {
            Node node = new Node(data);
            if (head == null) {
                head = node;
            } else {
                Node curr = head;
                while (curr.next != null) {
                    curr = curr.next;
                }
                curr.next = node;
            }
            size++;
            return node;
        }
        public void display() {
            Node i = head;
            while (i != null) {
                System.out.print(i.data + " -> ");
                i = i.next;
            }
            System.out.println("Null");
        }
    
        public void rev(){
            boolean flag = true;
            int i=0;
            Node temp1=head;
            while(temp1.next!=null)
                temp1=temp1.next;
            Node temp2 = null;
            Node temp3 = head;
            Node prev=null;
            while(i<size){
                if(temp3.data%2!=0 ){
                    if(flag){
                        Node temp4 = temp3.next;
                        head = temp3.next;
                        temp1.next=temp3;
                        temp3.next=temp2;
                        temp2=temp3;
                        temp3 = temp4;
                        i++;
                    }else{
                        prev.next=temp3.next;
                        Node temp4 = temp3.next;
                        temp1.next=temp3;
                        temp3.next=temp2;
                        temp2=temp3;
                        temp3=temp4;
                        i++;
                    }
                }
                else{
                    prev=temp3;
                    temp3=temp3.next;
                    flag=false;
                    i++;
                }
            }
        }
    }

    