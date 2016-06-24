package ua.goit.timonov.antMaven.module02;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Testing class for LongSquareTask
 */
public class LongTaskTest {

    @Test
    public void testExecuteNormal_1() {
        LongSquareTask task = new LongSquareTask(10L);
        task.execute();
        long actual = task.getResult();
        assertEquals(100, actual);
    }

    @Test
    public void testExecuteNormal_2() {
        LongSquareTask task = new LongSquareTask(0L);
        task.execute();
        long actual = task.getResult();
        assertEquals(0, actual);
    }

    @Test
    public void testExecuteNormal_3() {
        LongSquareTask task = new LongSquareTask(-20L);
        task.execute();
        long actual = task.getResult();
        assertEquals(400, actual);
    }

    @Test (expectedExceptions = TaskOverflowDataTypeException.class)
    public void testExecuteCatchForException_1() {
        LongSquareTask task = new LongSquareTask(Long.MAX_VALUE - 1);
        task.execute();
    }

    @Test (expectedExceptions = TaskOverflowDataTypeException.class)
    public void testExecuteCatchForException_2() {
        LongSquareTask task = new LongSquareTask(Long.MIN_VALUE + 1);
        task.execute();
    }

    @Test
    public void testGetResultNormal_1() {
        LongSquareTask task = new LongSquareTask(100L);
        task.execute();
        long actual = task.getResult();
        assertEquals(10_000, actual);
    }

    @Test
    public void testGetResultNormal_2() {
        LongSquareTask task = new LongSquareTask(0L);
        task.execute();
        long actual = task.getResult();
        assertEquals(0, actual);
    }

    @Test
    public void testGetResultNormal_3() {
        LongSquareTask task = new LongSquareTask(-20L);
        task.execute();
        long actual = task.getResult();
        assertEquals(400, actual);
    }
}