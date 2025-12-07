package customstacks;

public class Exceptions {
     public static class StackEmptyException extends Exception {
        public StackEmptyException() {
            super("Stack is empty");
        }

        public StackEmptyException(String message) {
            super(message);
        }
    }
    
}
