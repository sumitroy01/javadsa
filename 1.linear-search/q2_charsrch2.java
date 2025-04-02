public class q2_charsrch2 {
    public static void main(String[] args) {
        String myname = "sumit roy";
        char target = 'r';
        int indexofchar = ls(myname, target);
        System.out.println(indexofchar + ": is index after removing spaces");

    }

    static int ls(String myname, int target) {
        myname = myname.replace(" ", "");
        if (myname.length() == 0) {
            return -1;
        }
        for (int index = 0; index < myname.length(); index++) {
            if (target == myname.charAt(index)) {
                return index;

            }
        }

        return -1;
    }
}
