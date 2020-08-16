package offercode.Arrarys;

public class offer_03 {

    /**
     * 二维数组中的查找
     * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
     * 每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，
     * 判断数组中是否含有该整数。
     */

    public static void main(String[] args) {

        int [][] arr = new int[][]{
                {1,2,8,9},
                {2,4,9,12},
                {4,7,10,13},
                {6,8,11,15}
        };

        System.out.println(Find(16,arr));

    }

    public static boolean Find(int target, int [][] array) {

        int rows = array.length;
        if(rows==0) return false;

        int cols = array[0].length;
        if(cols==0) return false;

        int row = rows-1;
        int col = 0;
        while(row>=0 && col<cols){
            if(target < array[row][col]){
                row--;
            }else if(target > array[row][col]){
                col++;
            }else {
                return true;
            }
        }
        return false;
    }
}
