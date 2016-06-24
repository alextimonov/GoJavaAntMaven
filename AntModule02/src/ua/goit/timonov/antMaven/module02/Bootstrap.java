package ua.goit.timonov.antMaven.module02;

import java.util.ArrayList;
import java.util.List;

/**
 * console implementation for task about task, validator and executor
 */
public class Bootstrap {
    public static void main(String[] args) {
        Executor<Number> numberExecutor = makeIntTestSchedule();
        numberExecutor.execute();

        NumberExecutor myExecutor = (NumberExecutor) numberExecutor;
        for (TaskWithValidator task : myExecutor.getTaskSchedule()) {
            IntSquareTask intTask = (IntSquareTask) task.getTask();
            System.out.println(intTask);
        }

        System.out.println("Valid results are: ");
        for (Number validResult : numberExecutor.getValidResults()) {
            System.out.println(validResult);
        }

        System.out.println("Invalid results are: ");
        for (Number invalidResult : numberExecutor.getInvalidResults()) {
            System.out.println(invalidResult);
        }
    }

    private static Executor<Number> makeIntTestSchedule() {
        List<Task<Integer>> intTasks = new ArrayList<>();
        intTasks.add(new IntSquareTask(5));
        intTasks.add(new IntSquareTask(12));
        intTasks.add(new IntSquareTask(-10));
        intTasks.add(new IntSquareTask(Integer.MAX_VALUE - 1));
        intTasks.add(new IntSquareTask(Integer.MIN_VALUE + 1));

        Executor<Number> numberExecutor = new NumberExecutor();
        for (Task<Integer> intTask : intTasks) {
            numberExecutor.addTask(intTask);
        }
        numberExecutor.addTask(new IntSquareTask(7), new NumberValidator());
        return numberExecutor;
    }
}
