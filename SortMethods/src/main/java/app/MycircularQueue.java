package app;

import java.util.Arrays;

/**
 * LooQueue
 */
public class MyCircularQueue {

    private int[] nums = null;
    private int size = 0;
    private int head = -1;
    private int tail = -1;

    public MyCircularQueue(int length) {
        if (nums == null) {
            nums = new int[length];
        } else {
            /**
             * 初始化方法应该只能被调用一次。
             */
            if (length < size) {
                throw new IllegalArgumentException("length is too low to cover the original data.");
            }
            nums = Arrays.copyOf(nums, length);
        }
    }

    public int Front() {
        if (size == 0) {
            return -1;
        }
        return nums[head];
    }

    public int Rear() {
        if (size == 0) {
            return -1;
        }
        return nums[tail];
    }

    public boolean enQueue(int value) {
        if (size >= nums.length) {
            return false;
        }
        this.tail = (this.tail + 1) % nums.length;
        nums[this.tail] = value;
        size += 1;

        if (head == -1) {
            head = tail;
        }
        return true;
    }

    public boolean deQueue() {
        if (size <= 0) {
            return false;
        }
        this.head = (this.head + 1) % nums.length;
        size -= 1;
        return true;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == nums.length;
    }
}