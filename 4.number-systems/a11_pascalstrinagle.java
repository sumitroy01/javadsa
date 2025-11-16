// 1  -->1
// 1 1  --->2
// 1 2 1  ---->4
// 1 3 3 1 ----->8
// 1 4 6 4 1  ----->16
// 1 5 10 10 5 1 ------->32
//pascal triangle find the sum of nth row
//nc0+nc1+nc2+nc3+...ncn -- 2power N  nth term 2p n-1


public class a11_pascalstrinagle {
    public static void main(String[] args) {
        int n=4;
        int ans=1<<(n-1);
        System.out.println(ans);
    
    }
    
}
