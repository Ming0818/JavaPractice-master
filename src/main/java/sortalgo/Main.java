package sortalgo;
public class Main {
       static int count=0;
        public static void permute(int[] array, int start) {
            if (start == array.length) { // 输出
                String temp = "";
                for (int i : array) {
                    temp = temp + i;
                }
                if (Integer.valueOf(temp) % 7 == 0) {
                    count++;
                    System.out.println(count);
                    System.exit(0);
                }
            } else
                for (int i = start; i < array.length; ++i) {
                    swap(array, start, i); // 交换元bai素
                    permute(array, start + 1); // 交换后，再进行全排du列算法
                    swap(array, start, i); // 还原成原来的数组，zhi便于dao下一次的全排列
                }
        }

        private static void swap(int[] array, int s, int i) {
            int t = array[s];
            array[s] = array[i];
            array[i] = t;
        }
        public static void main(String[] args)
        {
            int[] array = new int[] { 1, 2, 3,4,5};
            permute(array, 0);
        }
}

