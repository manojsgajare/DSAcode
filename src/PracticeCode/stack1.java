//package PracticeCode;
//
//import org.w3c.dom.Node;
//
//public class stack1 {
//    static class node{
//        int data;
//        Node next;
//        public Node(int data){
//            this.data = data;
//            next = null;
//        }
//    }
//
//    static class stack{
//        public static node head;
//        public static boolean isEmpty() {
//            return head == null;
//        }
//
//        public static void push(int data){
//            Node newNode = new Node(data);
//            if (isEmpty()){
//                head = newNode;
//                return;
//            }
//            newNode.next = head;
//            head = newNode;
//        }
//
//        public static int pop(){
//            if (isEmpty()){
//                return -1;
//            }
//            int top = head.data;
//            head = head.next;
//            return top;
//        }
//    }
//    public static void main(String[] args) {
//
//    }
//}
