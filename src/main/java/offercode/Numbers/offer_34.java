package offercode.Numbers;

public class offer_34 {

    /**
     * 丑数
     * 把只包含质因子2、3和5的数称作丑数（Ugly Number）。
     * 例如6、8都是丑数，但14不是，因为它包含质因子7。
     * 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
     */

    public static void main(String[] args) {
        System.out.println(GetUglyNumber_Solution(7));
    }

    public static int GetUglyNumber_Solution(int index) {
        if (index < 7) return index;
        int k=0, m=0, n=0;
        int[] nums = new int[index];
        nums[0] = 1;
        for (int i = 1; i < index; i++) {
            nums[i] = Math.min(nums[k]*2, Math.min(nums[m]*3, nums[n]*5));
            if (nums[i] == nums[k]*2) k++;
            if (nums[i] == nums[m]*3) m++;
            if (nums[i] == nums[n]*5) n++;
        }
        return nums[index-1];
    }
}
