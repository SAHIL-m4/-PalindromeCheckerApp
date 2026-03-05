public class UseCase8PalindromeCheckerApp {
    static class Node {
        char data;
        Node next;
        Node(char data) { this.data = data; }
    }
    public static void main(String[] args) {
        String input = "level";
        System.out.println("Input : " + input);
        Node head = null;
        Node tail = null;
        for (char c : input.toCharArray()) {
            Node newNode = new Node(c);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        boolean isPalindrome = checkPalindrome(head);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }

    private static boolean checkPalindrome(Node head) {
        if (head == null || head.next == null) return true;

        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node secondHalfHead = reverseList(slow);
        Node firstHalfHead = head;

        Node tempSecond = secondHalfHead;
        boolean result = true;
        while (tempSecond != null) {
            if (firstHalfHead.data != tempSecond.data) {
                result = false;
                break;
            }
            firstHalfHead = firstHalfHead.next;
            tempSecond = tempSecond.next;
        }

        return result;
    }

    private static Node reverseList(Node head) {
        Node prev = null;
        Node current = head;
        while (current != null) {
            Node nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        return prev;
    }
}