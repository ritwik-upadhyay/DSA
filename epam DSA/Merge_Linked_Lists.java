public class Merge_Linked_Lists {
    //Creating a Node class for data and address of next node
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    //Main method to input linked lists and call the mergeLists function to get the merged list
    public static void main(String[] args) {
        
        //Input the first linked list
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(4);
        
        //Input the second linked list
        Node head2 = new Node(1);
        head2.next = new Node(3);
        head2.next.next = new Node(4);
        
        //Finding merged list
        Node result = mergeLists(head1,head2);
        while(result!=null) {
            System.out.print(result.data + " ");
            result = result.next;
        }
    }
    
    //Function to merge two sorted linked lists
    public static Node mergeLists(Node head1, Node head2) {
        
        //Creating a dummy node to attach other nodes of both lists to it
        Node dummy = new Node(-1);
        Node current = dummy;
        
        //loop running till any one linked list becomes empty
        while(head1!=null && head2!=null) {
            
            //Checking which out of two nodes in both linked lists is smaller
            if(head1.data<=head2.data) {
                current.next = head1;
                head1 = head1.next;//moving to next node of 1st list
            }
            else {
                current.next = head2;
                head2 = head2.next;//moving to next node of 2nd list
            }
            current = current.next;//Moving the current node to next node
        }
        
        //Adding remaining nodes in any of the two linked lists
        if(head1!=null) {
            current.next = head1;
        }
        else {
            current.next = head2;
        }
        return dummy.next;//returning the entire list excluding dummy node
    }
}