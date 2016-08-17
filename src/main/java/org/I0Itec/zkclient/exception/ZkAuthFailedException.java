package org.I0Itec.zkclient.exception;

/**
 * Created with IntelliJ IDEA.
 * User: lin.zhao
 * Email: linlemo@gmail.com
 * Date: 16/8/17
 * Time: 19:52
 */
public class ZkAuthFailedException extends ZkException{

    private static final long serialVersionUID = 1L;

    public ZkAuthFailedException() {
        super();
    }

    public ZkAuthFailedException(String message, Throwable cause) {
        super(message, cause);
    }

    public ZkAuthFailedException(String message) {
        super(message);
    }

    public ZkAuthFailedException(Throwable cause) {
        super(cause);
    }
}
