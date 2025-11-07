
import java.util.ArrayList;

class a_countingpaths{

    public static void main(String[] args){
        
        int [] arr={2,2};
        int total=countpath(3,3);
        System.out.println(total);
        printpath("", 3, 3);
        
        System.out.println((printpaths(" ", 2, 2)));
        System.out.println((printpathdiagonal(" ", 3, 3)));
        
    }
        static int countpath(int row,int col){
            if (row==1 || col==1) {
                return 1;
            }
            int left=countpath(row-1,col);
            int right=countpath(row,col-1);



            return left+right;
        }

        static void printpath(String p,int r,int col){
            if (r==1 && col==1) {
                System.out.println(p);
                return;
            }
            if (r>1) {
                printpath(p+'r', r-1, col);
            }
            if (col>1) {
                printpath(p+'d', r, col-1);
            }


        }

        static ArrayList<String> printpaths(String p,int r,int c){
            if (r==1 && c==1) {
                ArrayList<String> list = new ArrayList<>();
                list.add(p);
                return list;
            }
                ArrayList<String> list = new ArrayList<>();

            if (r>1) {
                list.addAll(printpaths(p+'d', r-1, c));
            }

            if (c>1) {
                list.addAll(printpaths(p+'r', r, c-1));
                
            }
            return list;
        
        }   

           static ArrayList<String> printpathdiagonal(String p,int r,int c){
            if (r==1 && c==1) {
                ArrayList<String> list = new ArrayList<>();
                list.add(p);
                return list;
            }
                ArrayList<String> list = new ArrayList<>();

            if (r>1 && c>1) {
                list.addAll(printpathdiagonal(p+'x', r-1, c-1));
            }

            if (r>1) {
                list.addAll(printpathdiagonal(p+'d', r-1, c));
            }

            if (c>1) {
                list.addAll(printpathdiagonal(p+'r', r, c-1));
                
            }
            return list;
        
        }   

    
}