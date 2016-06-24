package ua.goit.timonov.antMaven.module02;

/**
 * Indicates that a type overflow will take place during execution with received value
 */
public class TaskOverflowDataTypeException extends IllegalArgumentException {

    public TaskOverflowDataTypeException(String message) {
        super(message);
    }
}
