
import java.util.ArrayList;
public class a5_dice {


    public static void main(String[] args) {
        ArrayList<String> ans = findall(1, 12);
        System.out.println(ans);
    }

    static ArrayList<String> findall(int num, int target) {
        ArrayList<String> result = new ArrayList<>();
        helper(num, target, result);
        return result;
    }

    static void helper(int num, int target, ArrayList<String> result) {

        if (num > target) {
            return;
        }

        int total = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= 6; i++) {
            while (total + num <= target) {
                total += num;
                sb.append(num);
            }
        }

        result.add(sb.toString());

        num = num + 1;
        helper(num, target, result);
    }
}
