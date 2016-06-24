package ua.goit.timonov.antMaven.module02;

/**
 * Indicates that method execute() has been invoked
 */
public class ExecuteWasInvokedException extends RuntimeException {

    public ExecuteWasInvokedException(String message) {
        super(message);
    }
}
