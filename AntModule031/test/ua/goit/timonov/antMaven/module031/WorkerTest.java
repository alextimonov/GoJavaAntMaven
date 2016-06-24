package ua.goit.timonov.antMaven.module031;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Testing class for Worker and SimpleSemaphore
 */
public class WorkerTest {
    private Semaphore semaphore;

    @Test(timeOut = 500)
    public void testReceiveSemaphorePermitsNormal_1() {
        semaphore = new SimpleSemaphore(5);
        Worker worker = new Worker(3, semaphore);
        worker.receiveSemaphorePermits();
        int availablePermits = semaphore.getAvailablePermits();
        assertEquals(availablePermits, 2);
    }

    @Test(timeOut = 500)
    public void testReceiveSemaphorePermitsNormal_2() {
        semaphore = new SimpleSemaphore(5);
        Worker worker = new Worker(5, semaphore);
        worker.receiveSemaphorePermits();
        int availablePermits = semaphore.getAvailablePermits();
        assertEquals(availablePermits, 0);
    }

    @Test(timeOut = 500)
    public void testReceiveSemaphorePermitsNormal_3() {
        semaphore = new SimpleSemaphore(5);
        Worker worker = new Worker(1, semaphore);
        worker.receiveSemaphorePermits();
        int availablePermits = semaphore.getAvailablePermits();
        assertEquals(availablePermits, 4);
    }

    @Test(enabled = false, timeOut = 500)
    public void testReceiveSemaphorePermitsTimeoutAchieved() {
        semaphore = new SimpleSemaphore(5);
        Worker worker = new Worker(6, semaphore);
        worker.receiveSemaphorePermits();
        int availablePermits = semaphore.getAvailablePermits();
        assertEquals(availablePermits, 5);
    }

    @Test(timeOut = 500)
    public void testReleasePermitsNormal_1() {
        semaphore = new SimpleSemaphore(5);
        Worker worker1 = new Worker(3, semaphore);
        worker1.receiveSemaphorePermits();

        Worker worker2 = new Worker(2, semaphore);
        worker2.receiveSemaphorePermits();

        worker1.releaseSemaphorePermits();

        int availablePermits = semaphore.getAvailablePermits();
        assertEquals(availablePermits, 3);
    }

    @Test(timeOut = 500)
    public void testReleaseSemaphorePermitsNormal_2() {
        semaphore = new SimpleSemaphore(5);
        Worker worker1 = new Worker(1, semaphore);
        worker1.receiveSemaphorePermits();

        Worker worker2 = new Worker(3, semaphore);
        worker2.receiveSemaphorePermits();

        worker1.releaseSemaphorePermits();

        int availablePermits = semaphore.getAvailablePermits();
        assertEquals(availablePermits, 2);
    }

    @Test(timeOut = 500)
    public void testReleaseSemaphorePermitsNormal_3() {
        semaphore = new SimpleSemaphore(5);
        Worker worker1 = new Worker(2, semaphore);
        worker1.receiveSemaphorePermits();

        Worker worker2 = new Worker(3, semaphore);
        worker2.receiveSemaphorePermits();

        worker1.releaseSemaphorePermits();
        worker2.releaseSemaphorePermits();


        int availablePermits = semaphore.getAvailablePermits();
        assertEquals(availablePermits, 5);
    }

    @Test(timeOut = 500)
    public void testRunNormal_1() throws Exception {
        semaphore = new SimpleSemaphore(5);
        Worker worker1 = new Worker(2, semaphore);
        worker1.run();

        Worker worker2 = new Worker(3, semaphore);
        worker2.run();

        int availablePermits = semaphore.getAvailablePermits();
        assertEquals(availablePermits, 5);
    }

    @Test(timeOut = 500)
    public void testRunNormal_2() {
        semaphore = new SimpleSemaphore(5);
        Worker worker1 = new Worker(3, semaphore);
        Worker worker2 = new Worker(4, semaphore);
        Worker worker3 = new Worker(5, semaphore);

        worker1.run();
        worker2.run();
        worker3.run();

        int availablePermits = semaphore.getAvailablePermits();
        assertEquals(availablePermits, 5);
    }
}