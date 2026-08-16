public class Remove_Duplicates {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node removeDuplicates(Node head) {
        if (head == null) return null; // handle empty list

        Node current = head;
        // traversal through linked list
        while (current.next != null) {
            // condition checking duplicacy
            if (current.data == current.next.data) {
                // skipping the duplicate one
                current.next = current.next.next;
            } else {
                // moving forward if no duplicate found
                current = current.next;
            }
        }
        // returning head as current is at last node
        return head;
    }

    public static void main(String[] args) {
        // creating a sample linked list
        Node head = new Node(1);
        head.next = new Node(1);
        head.next.next = new Node(2);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(3);

        Node result = removeDuplicates(head);
        System.out.println("The final sorted linked list is:");
        while (result != null) {
            System.out.print(result.data + " ");
            result = result.next;
        }
        System.out.println();
    }
}
