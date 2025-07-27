import java.util.*;
class ListNode{
    int data;
    ListNode next;
    ListNode(int data){
        this.data=data;
        this.next=null;
    }
}

class LinkedList{
    ListNode head;
    void traversal(){
        if(head==null){
            System.out.println("LL is empty");
            return;
        }
        ListNode temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("Null");
    }
    //insert at begin
    void insert_at_begin(int data){
        ListNode newnode=new ListNode(data);
        if(head==null){
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }
    //insert at end
    void insert_at_end(int data){
        ListNode newnode=new ListNode(data);
        if(head==null){
            head=newnode;
            return;
        }
        ListNode temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
    }
    //insert at middle
    void insert_at_middle(int data){
        ListNode newnode=new ListNode(data);
        ListNode temp=head;
        int curr_pos=1;
        int position=3;
        if(position<1){
            System.out.println("Invalid position");
            return;
        }
        if(position==1){
            newnode.next=head;
            head=newnode;
            return;
        }
        while(temp!=null && curr_pos<position-1){
            temp=temp.next;
            curr_pos++;
        }
        if(temp==null){
            System.out.println("position out of range");
            return;
        }
        newnode.next=temp.next;
        temp.next=newnode;
    }


    //delete at begin
    void delete_at_begin(int data){
        if(head==null){
            System.out.println("Linked list is empty");
        }
        head=head.next;
    }

    //delete at end
    void delete_at_end(int data){
        ListNode temp=head,prev=null;        
        if(head==null){
            System.out.println("Linkedlist is empty");
        }
        if(head.next==null){
            head=null;
            temp=null;
            return;
        }
        while(temp.next!=null){
            prev=temp;
            temp=temp.next;
        }
        prev.next=null;
        temp=null;
    }

    //delete at specified position
    void delete_at_pos(int data,int pos){
        if(pos<0 || head==null){
            System.out.println("Linked list is empty");
        }
        if(pos==1){
            head=head.next;
        }
        ListNode temp=head,prev=null;
        int cur_pos=1;
        while(temp!=null && cur_pos<pos){
            prev=temp;
            temp=temp.next;
            cur_pos++;
        }
        if(temp==null){
            System.out.println("out of range");
        }
        prev.next=temp.next;
    }    
}

public class ImplementationOfLinkedlist {
    public static void main(String args[]){
    LinkedList ob=new LinkedList();
    ob.insert_at_begin(111);
    ob.insert_at_begin(222);
    ob.insert_at_begin(333);
    ob.insert_at_end(99);
    ob.insert_at_end(88);
    ob.insert_at_end(77);
    ob.insert_at_middle(100);
    ob.delete_at_begin(333);
    ob.delete_at_end(77);
    ob.delete_at_pos(100, 2);
    ob.traversal();
    }   
}
