package DSA_PROGRAMS.LinkedLists;
import java.util.*;
public class last_practice {
    public static class Node{
        int data;
        Node next;
        Node(){
            data=0;
            next=null;
        }
        Node(int data){
            this.data=data;
        }
    }
    public static class linkedlist{
        Node head=null;
        Node tail=null;
        int size=0;
        public void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" -> ");
                temp=temp.next;
            }
            System.out.println("null");
        }
        public void insert(int data){
            size++;
            Node temp=new Node(data);
            if(head==null){
                head=temp;
                tail=temp;
            }
            else{
                tail.next=temp;
                tail=temp;
            }
        }
        public void insert(int index,int data){
            size++;
            Node temp=new Node(data);
            if(index==0){
                temp.next=head;
                head=temp;
            }
            else if (index==size) {
                insert(data);
            }
            else{
                Node temp2=head;
                for(int i=1;i<index;i++){
                    temp2=temp2.next;
                }
                temp.next=temp2.next;
                temp2.next=temp;
            }
        }
        public int getAt(int index){
            Node temp=head;
            for(int i=1;i<=index;i++){
                temp=temp.next;
            }
            return temp.data;
        }
        public void setAt(int index,int data){
            Node temp=head;
            for(int i=1;i<=index;i++){
                temp=temp.next;
            }
            temp.data=data;
        }
        public void remove(int data){
            Node temp=head.next;
            Node prev=head;
            if(head.data==data){
                
            }
            while(temp!=null){
                if(temp.data==data){
                    prev.next=temp.next;
                    return;
                }
                temp=temp.next;
                prev=prev.next;
            }
        }
        int length(){
            return size;
        }
        
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        // Node a=new Node(1);
        // Node b=new Node(2);
        // a.next=b;
        // System.out.println(a.data);
        // System.out.println(a.next.data + b.data);
        // System.out.println(a.next+"\n"+b+"\n"+b.next);

        linkedlist l1=new linkedlist();
        l1.insert(1);
        l1.insert(2);
        l1.insert(3);
        l1.insert(4);
        l1.insert(5);
        l1.insert(6);
        l1.insert(6,8);
        l1.display();
        System.out.println("length : "+l1.length());
        System.out.println(l1.getAt(6));
        l1.setAt(3,100000);
        l1.display();
        l1.remove(0);
        l1.display();
        // System.out.println(l1.head.data);
    }
}
