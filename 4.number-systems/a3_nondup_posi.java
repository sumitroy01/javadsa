public class a3_nondup_posi {
    public static void main(String[] args) {
        int [] nums={1,2,3,-1,-2,-3,5};
        adder(nums);
    }

    static void adder(int[] nums){
       int sol =0;
        for (int i : nums) {
            //sol +=i;
            sol ^=i;
        }

        System.out.println(sol);
    }
}
