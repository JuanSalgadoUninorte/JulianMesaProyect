package co.com.dxc.exceptions;

public class EnvironmentError extends Error{
    public EnvironmentError(String exceptionMessage, Throwable trowable){
        super(exceptionMessage, trowable);
    }

    public EnvironmentError(String exceptionMessage){
        super(exceptionMessage);
    }
}
