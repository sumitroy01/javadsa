
public class b_pathrestrictions {
    public static void main(String[] args) {
        boolean[][] maxe={
            {true,true,false},
            {true,true,false},
            {true,true,true}
        };

        printpathdiagonal("", maxe, 0, 0);
    }

      static  void printpathdiagonal(String p,boolean[][] maze,int r,int c){
            if (r==maze.length-1 && c ==maze[0].length-1) {
               System.out.println(p);
            }
                
            if (!maze[r][c]) {
                return;
            }
         

            if (r<maze.length-1) {
               printpathdiagonal(p+'d', maze,r+1, c);
            }

            if (c<maze[0].length-1) {
              printpathdiagonal(p+'r', maze,r, c+1);
                
            }
            
        
        }   

}
