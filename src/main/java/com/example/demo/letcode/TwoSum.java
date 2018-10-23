package com.example.demo.letcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。
 * 你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。
 * 示例:
 * 给定 nums = [2, 7, 11, 15], target = 9
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 */
public class TwoSum {

    /**
     * 两遍哈希表
     * <p>
     * 为了对运行时间复杂度进行优化，我们需要一种更有效的方法来检查数组中是否存在目标元素。如果存在，我们需要找出它的索引。保持数组中的每个元素与其索引相互对应的最好方法是什么？哈希表。
     * <p>
     * 通过以空间换取速度的方式，我们可以将查找时间从O(n) 降低到
     * O(1)。哈希表正是为此目的而构建的，它支持以 近似 恒定的时间进行快速查找。我用“近似”来描述，是因为一旦出现冲突，查找用时可能会退化到
     * O(n)。但只要你仔细地挑选哈希函数，在哈希表中进行查找的用时应当被摊销为O(1)。
     * <p>
     * 一个简单的实现使用了两次迭代。在第一次迭代中，我们将每个元素的值和它的索引添加到表中。然后，在第二次迭代中，我们将检查每个元素所对应的目标元素（target−nums[i]）是否存在于表中。
     * 注意，该目标元素不能nums[i] 本身！
     * <p>
     * 时间复杂度：
     * O(n)， 我们把包含有n 个元素的列表遍历两次。由于哈希表将查找时间缩短到O(1) ，所以时间复杂度为O(n)。
     * 空间复杂度：
     * O(n)， 所需的额外空间取决于哈希表中存储的元素数量，该表中存储了n 个元素。
     *
     * @param nums
     * @param targer
     * @return int[]
     */
    public static int[] twoSum(int[] nums, int targer) {
        Map map = new HashMap<Integer, Integer>();
        //构建哈希表
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int comp = targer - nums[i];
            if (map.containsKey(comp) && (int) map.get(comp) != i) {
                return new int[]{nums[i], nums[(int) map.get(comp)]};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    /**
     * 一遍哈希表
     * 事实证明，我们可以一次完成。
     * 在进行迭代并将元素插入到表中的同时，我们还会回过头来检查表中是否已经存在当前元素所对应的目标元素。
     * 如果它存在，那我们已经找到了对应解，并立即将其返回。
     */
    public static int[] twoSumOneHash(int[] nums, int targer) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        //构建哈希表
        for (int i = 0; i < nums.length; i++) {
            int comp = targer - nums[i];
            if (map.containsKey(comp) && i != map.get(comp)) {
                return new int[]{nums[i], nums[(int) map.get(comp)]};
            }
            map.put(nums[i], i);
        }

        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        int[] ints1 = {2, 7, 11, 15};
        int[] ints = twoSum(ints1,9);
        int[] twoSumOneHash = twoSumOneHash(ints1,9);
        System.out.println(ints[0]+" "+ints[1] + "   " + twoSumOneHash[0]+" "+twoSumOneHash[1]);
    }

}
