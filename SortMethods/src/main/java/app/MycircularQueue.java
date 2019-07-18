package app;

import java.util.Arrays;

/**
 * LooQueue
 */
public class MycircularQueue {

    private int[] nums = null;
    private int size = 0;
    private int head = -1;
    private int tail = -1;

    public MycircularQueue(int length) {
        if (nums == null) {
            nums = new int[length];
        } else {
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
        nums[(this.tail + 1) % size] = value;
        this.tail = this.tail + 1;
        return true;
    }

    public int deQueue() {
        if (size <= 0) {
            return -1;
        }
        int temp = nums[head];
        nums[head] = 0;
        this.head = (this.head + 1) % size;
        return temp;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == nums.length;
    }
}