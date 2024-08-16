/* Write a Java program to create a basic Java thread that prints "Hello, World!" when executed.*/

public class JavaThread extends  Thread{

    public void run(){
        System.out.println("Hell',World");
    }
    public static void main(String[] args) {
        JavaThread javaThread=new JavaThread();
        javaThread.start();
    }
}


//public class JavaThread implements Runnable {
//
//    public void run(){
//        System.out.println("Hello, World");
//    }
//
//    public static void main(String[] args) {
//        JavaThread thread=new JavaThread();
//
//        Thread thread1=new Thread(thread);
//
//        thread1.start();
//    }
//}
