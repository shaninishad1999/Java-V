
public class MyFirstException extends Throwable{
    String msg;

    public MyFirstException(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;

    }
}

