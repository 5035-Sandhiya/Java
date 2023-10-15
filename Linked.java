import java.util.*;
class Linkedlist
{
    class Node{
        int data;
        Node next;
        Node(int a){
          data=a;
          next=null;
        }
    }
    Node head=null;
    void push(int a){
       Node h=new Node(a);
        if(head==null){
            head=h;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=h;
       
    }
   
    void print(){
         Node temp=head;
       while(temp.next!=null){
           System.out.print(temp.data+" ->");
           temp=temp.next;
       } 
       System.out.print(temp.data);
    }
    Node reverse( ){
        Node pre=null;
        Node current=head;
        Node next=null;
        while(current!=null){
            next=current.next;
            current.next=pre;
            pre=current;
            current=next;
        }
       
        return pre;
    }
     int middle(){
         
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.data;
    }


  Node addatfront(Node head,int data){
      Node temp=new Node(data);
      if(head==null){
          head=temp;
          return head;
      }
      temp.next=head;
      return temp;
  }
  
  Node addatlast(Node head,int data){
      Node temp=new Node(data);
      if(head==null){
          head=temp;
          return head;
      }
      Node h=head;
      while(h.next!=null){
          h=h.next;
      }
      h.next=temp;
     return head;
  }


int length(){
    Node h=head;
    int c=0;
    while(h!=null){
        c+=1;
        h=h.next;
    }
    return c;
}

Node delete(Node head,int a){
    Node h=head;
    while(h.next!=null){
        if(h.next.data==a){
            h.next=h.next.next;
            return head;
        }
        h=h.next;
    }
    return head;
}

}
class  Linked{
	public static void main(String[] args) {
	    System.out.print("Enter the number: ");
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    Linkedlist obj=new Linkedlist();
	    for(int i=0;i<n;i++){
	        obj.push(sc.nextInt());
	    }
	    
	    obj.print();
	    
	   System.out.println();  
	  System.out.println("The middle element is "+obj.middle());
	  System.out.println("The length of the linked list is "+obj.length());
	   obj.head = obj.reverse( );
	   
	    obj.print();
	    
	  System.out.println(); 
            System.out.print("Enter the number to add at front: "); 
	   obj.head = obj.addatfront(obj.head,sc.nextInt());
	  obj.print();
	  
	  System.out.println(); 
             System.out.print("Enter the number to add at last: ");  
	   obj.head = obj.addatlast(obj.head,sc.nextInt());
	  obj.print();
	  
 	  System.out.println();
            System.out.print("Enter the number to be deleted: "); 
        obj.head=obj.delete(obj.head,sc.nextInt());
 	  obj.print();
	}
}
