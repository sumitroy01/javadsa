//q2: searching a character in a string string name = sumit roy and target =r;

public class q2 {
    public static void main(String[] args) {
        String myname = "sumit roy";
        char target = 'r';
        int indexoftarget = ls(myname, target);
        System.out.println("the index of your target character is :" + indexoftarget);

    }

    static int ls(String name, char target) {
        if (name.length() == 0) {
            return -1;
        }
        for (int index = 0; index < name.length(); index++) {
            if (target == name.charAt(index)) {
                return index;

            }
        }
        return -1;
    }
}
