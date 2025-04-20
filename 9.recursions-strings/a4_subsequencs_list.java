
import java.util.ArrayList;

public class a4_subsequencs_list {

    public static void main(String[] args) {
        ArrayList<String> mylist=susbequences("", "abcd");
        System.out.println(mylist);
        
    }

    static ArrayList<String>  susbequences(String giver,String original){
        ArrayList<String> mylist=new ArrayList<>();
        if (original.isEmpty()) {
            mylist.add(giver);    
            return mylist;
        }

        char letterone=original.charAt(0);
        String remains=original.substring(1);

        mylist.addAll(susbequences(giver+letterone, remains));
        mylist.addAll(susbequences(giver, remains));

        return  mylist;



    }
}