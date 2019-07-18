package app;

import org.junit.*;

/**
 * MycircularQueueTest
 */
public class MycircularQueueTest {

    @Test
    public void testBase() {
        MyCircularQueue circularQueue = new MyCircularQueue(3); // 设置长度为 3

        circularQueue.enQueue(1); // 返回 true

        circularQueue.enQueue(2); // 返回 true

        circularQueue.enQueue(3); // 返回 true

        Assert.assertFalse(circularQueue.enQueue(4)); // 返回 false，队列已满

        Assert.assertEquals(3, circularQueue.Rear()); // 返回 3

        circularQueue.isFull(); // 返回 true

        Assert.assertTrue(circularQueue.deQueue());

        circularQueue.enQueue(4); // 返回 true

        Assert.assertEquals(4, circularQueue.Rear()); // 返回 4
    }
}