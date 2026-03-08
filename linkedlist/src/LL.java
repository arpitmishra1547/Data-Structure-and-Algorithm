public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }


    private class Node {

        // This stores the actual data of the node
        private int value;

        /*
         * This is NOT creating a new Node.
         * This variable will STORE the reference (address)
         * of another Node object.
         *
         * Think like this:
         * Each node points to the next node in the list.
         *
         * Example:
         * [10 | next] → [20 | next] → [30 | null]
         *
         * So 'next' is of type Node because
         * it needs to store another Node.
         */
        private Node next;

        // Constructor when we only know the value
        // 'next' will automatically be null (default)
        public Node(int value) {
            this.value = value;
        }

        /*

         * Example:
         * Node node2 = new Node(20);
         * Node node1 = new Node(10, node2);
         *
         * Now node1.next points to node2.
         */
        public Node(int value, Node next) {
            this.value = value;   // store data
            this.next = next;     // store reference of next node
        }
    }

    public void insertFirst(int val){

        // Step 1: Create a new node with given value
        Node node = new Node(val);

        /*
         * Step 2:
         * Make new node point to current head.
         *
         * If list was:
         * head → [10] → [20] → null
         *
         * After this line:
         * node → [val] → [10] → [20]
         */
        node.next = head;

        /*
         * Step 3:
         * Move head to this new node.
         *
         * Now new node becomes first node.
         */
        head = node;

        /*
         * Step 4:
         * If tail is null, that means list was empty before insertion.
         *
         * Example:
         * Before: head = null, tail = null
         * After inserting first element:
         * head should point to new node
         * tail should ALSO point to same node
         */
        if (tail == null) {
            tail = head;
        }

        // Step 5: Increase size of linked list
        size += 1;
    }
    public void insertLast(int val) {

        /*
         * If tail is null,
         * it means the linked list is completely empty.
         *
         * Because in an empty list:
         * head = null
         * tail = null
         *
         * In that case, inserting at last
         * is same as inserting at first.
         */
        if (tail == null) {
            insertFirst(val);   // handle empty list case
            return;             // stop execution here
        }

        /*
         * Create a new node with given value.
         * Its 'next' will automatically be null
         * because it will become the new last node.
         */
        Node node = new Node(val);

        /*
         * Connect current tail to the new node.
         *
         * Before:
         * head → [10] → [20] → null
         *                     ↑
         *                    tail
         *
         * After this line:
         * head → [10] → [20] → [val] → null
         */
        tail.next = node;

        /*
         * Move tail reference forward.
         * Now tail should point to the new last node.
         */
        tail = node;

        /*
         * Increase size of the linked list
         * because we added one element.
         */
        size++;
    }

    public void insert(int val, int index) {
        if(index == 0) {
            insertFirst(val);
            return;
        }
        if(index == size) {
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;

        size++;
    }

    public int deleteLast() {
        if(size <= 1) {
            return deleteFirst();
        }

        Node secondLast = get(size-2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if( head == null){
            tail = null;
        }
        size--;
        return val;
    }

    public void display(){
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }
}
