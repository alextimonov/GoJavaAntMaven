package ua.goit.timonov.antMaven.module02;

/**
 * Indicates that method execute() hasn't been invoked
 */
public class ExecuteWasNotInvokedException extends RuntimeException {
    public ExecuteWasNotInvokedException(String message) {
        super(message);
    }
}
