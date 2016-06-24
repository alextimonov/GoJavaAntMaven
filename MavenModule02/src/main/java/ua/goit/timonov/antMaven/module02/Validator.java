package ua.goit.timonov.antMaven.module02;

/**
 * Validator for received value
 */
public interface Validator <T> {

    /**
     * validates given value
     * @param result        received result
     * @return              true if result is valid
     */
    boolean isValid(T result);
}
