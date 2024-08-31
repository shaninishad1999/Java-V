public class MyArrayIndexOutOfBoundsException extends Exception {
    private String message = "ArrayIndexOutOfBoundsException occurred!";

    // Constructor that accepts a custom message
    public MyArrayIndexOutOfBoundsException(String message) {
        this.message = message;
    }

    // Override the getMessage method to return the custom message
    @Override
    public String getMessage() {
        return message;
    }
}
