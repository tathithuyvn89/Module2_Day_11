package thuchanh_stack_inlinkedlist;

public class GenericStackClient {
    private static void stackOfIString() {
        MyGenericStack<String> stack = new MyGenericStack();
        stack.push("Five");
        stack.push("Four");
        stack.push("Three");
        stack.push("Two");
        stack.push("One");

        System.out.println("1.1 of stack after push operation : " + stack.size());
        System.out.printf("1.2. Pop elements from stack: ");
        while (!stack.isEmty()) {
            System.out.printf("%s", stack.pop());
        }
        System.out.println("\n1.3 Size of stack after pop operation: " + stack.size());
    }

    private static void stackOfIntergers() {
        MyGenericStack<Integer> stack = new MyGenericStack();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("2.1 Size of stack after push operation: " + stack.size());
        System.out.printf("2.2 Pop elements from stack: ");
        while (!stack.isEmty()) {
            System.out.printf("%d", stack.pop());
        }
        System.out.println("\n3.3 Size of stack after pop operation: " + stack.size());
    }

    public static void main(String[] args) {
        System.out.println("1. Stack of integers");
        stackOfIntergers();
        System.out.println("\n2. Stack of Strings");
        stackOfIString();
    }
}



