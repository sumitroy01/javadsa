//max wealth question {{1,2,3},{1,1,1},{6,66,6},{9,99,9}}
// each of the individual should be added {1+2+3}=6;
//with max total is maxwealth
public class q8_maxwealth {
    public static void main(String[] args) {
        int[][] arr2d = { { 1, 2, 3 }, { 1, 1, 1 }, { 6, 66, 6 }, { 9, 99, 9 } };
        int sum = maxwealth(arr2d);
        System.out.println(sum);
    }

    static int maxwealth(int[][] array2d) {
        int max = 0;
        for (int rows = 0; rows < array2d.length; rows++) {
            int sum = 0;// reseting sum for every colum
            for (int col = 0; col < array2d[rows].length; col++) {
                sum += array2d[rows][col];
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }
}
