import java.util.LinkedList;
import java.util.Scanner;

class NodeBi {
    int data;
    NodeBi next;
    NodeBi prev;

    NodeBi(int data, NodeBi next, NodeBi prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
}

class CircularLinkedList {
    NodeBi head;
    NodeBi tail;

    CircularLinkedList(NodeBi node) {
        this.head = node;
        this.tail = node;
        node.next = this.head;
        node.prev = this.tail;
    }

    public boolean isEmpty() {
        if (this.head == null) {
            return true;
        }
        return false;
    }

    // 연결 리스트에 데이터 추가
    // before_data가 null인 경우, 가장 뒤에 추가
    // before_data에 값이 있는 경우, 해당 값을 가진 노드 앞에 추가
    public void addData(int data, Integer beforeData) {
        if (this.head == null) {
            NodeBi newNodeBi = new NodeBi(data, null, null);
            this.head = newNodeBi;
            this.tail = newNodeBi;
            newNodeBi.next = newNodeBi;
            newNodeBi.prev = newNodeBi;
        } else if (beforeData == null) {    // 가장 뒤에 추가
            NodeBi newNodeBi = new NodeBi(data, this.head, this.tail);
            this.tail.next = newNodeBi;
            this.head.prev = newNodeBi;
            this.tail = newNodeBi;
        } else {
            NodeBi cur = this.head;
            NodeBi pre = cur;
            do {
                if (cur.data == beforeData) {   // before_data가 있고 head일 경우
                    if (cur == this.head) {
                        NodeBi newNodeBi = new NodeBi(data, this.head, this.tail);
                        this.tail.next = newNodeBi;
                        this.head.prev = newNodeBi;
                        this.head = newNodeBi;
                    } else {    // 노드 중간 추가
                        NodeBi newNodeBi = new NodeBi(data, cur, pre);
                        pre.next = newNodeBi;
                        cur.prev = newNodeBi;
                    }
                    break;
                }
                pre = cur;
                cur = cur.next;
            } while (cur != this.head);
        }
    }

    // 연결 리스트에서 특정 값을 가진 노드 삭제
    public void removeData(int data) {
        if (this.isEmpty()) {
            System.out.println("List is empty");
            return;
        }

        NodeBi cur = this.head;
        NodeBi pre = cur;

        while (cur != null) {
            if (cur.data == data) {
                if (cur == this.head && cur == this.tail) {
                    this.head = null;
                    this.tail = null;
                } else if (cur == this.head) {
                    cur.next.prev = this.head.prev; // = this.tail로 해도 됨
                    this.head = cur.next;
                    this.tail.next = this.head;
                } else if (cur == this.tail) {
                    pre.next = this.tail.next;  // = this.head로 해도 될 듯?
                    this.tail = pre;
                    this.head.prev = this.tail;
                } else {    // 중간일 때
                    pre.next = cur.next;
                    cur.next.prev = pre;
                }
                break;
            }
            pre = cur;
            cur = cur.next;
        }
    }
}


public class no_1158 {
    public static void solution(int a, int b) {
        CircularLinkedList list = new CircularLinkedList(new NodeBi(1, null, null));
        LinkedList<Integer> result = new LinkedList();

        for (int i = 1; i < a; i++) {
            list.addData(i + 1, null);
        }

        NodeBi cur = list.head;

        System.out.print("<");
        for (int i = 0; i < a; i++) {
            if (i == 0) {
                for (int j = 0; j < b - 1; j++) {
                    cur = cur.next;
                }
            } else {
                for (int j = 0; j < b; j++) {
                    cur = cur.next;
                }
            }
            result.add(cur.data);
            list.removeData(cur.data);

            if (i == a - 1) {
                System.out.print(result.get(i));
            } else {
                System.out.print(result.get(i) + ", ");
            }
        }
        System.out.print(">");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        solution(a, b);
    }
}