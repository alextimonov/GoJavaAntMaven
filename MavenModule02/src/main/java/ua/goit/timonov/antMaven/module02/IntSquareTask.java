package ua.goit.timonov.antMaven.module02;

import java.util.Random;

/**
 * Task with integer values, multiplication by multiplier
 */
public class IntSquareTask implements Task<Integer> {
    public static final int POWER = 2;

    /* value that will be executed */
    private Integer value;

    /* result of multiplication */
    private Integer result;

    public IntSquareTask() {
        Random rand = new Random();
        value = rand.nextInt();
    }

    public IntSquareTask(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    /**
     * executes the task
     */
    @Override
    public void execute() {
        checkIntegerArgument();
        result = 1;
        for (int i = 0; i < POWER; i++) {
            result *= value;
        }
    }

    // checks if multiplication can be made without type overflow
    private void checkIntegerArgument() {
        if (Math.abs(value) > Math.sqrt(Integer.MAX_VALUE)) {
//            result = Integer.MAX_VALUE;
            throw new TaskOverflowDataTypeException("Long type will be overflow through Integer.MAX_VALUE");
        }
    }

    /**
     * return the result of execution
     * @return      result of execution
     */
    @Override
    public Integer getResult() {
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("IntSquareTask{");
        sb.append("value=").append(value);
        sb.append(", result=").append(result);
        sb.append('}');
        return sb.toString();
    }
}
