public class recursion3 {

    public static void prtperm(String str, String permutation) {
        if (str.length() == 0) {
            System.out.println(permutation);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            String newString = str.substring(0, i) + str.substring(i + 1);
            prtperm(newString, permutation + currChar);
        }
    }

    public static int countpaths(int i, int j, int m, int n) {
        if (i == n || j == m) {
            return 0;
        }
        if (i == n - 1 && j == m - 1) {
            return 1;
        }
        int downpaths = countpaths(i + 1, j, n, m);
        int rightpaths = countpaths(i, j + 1, n, m);
        return downpaths + rightpaths;
    }

    public static void main(String[] args) {
        //prtperm("abc","");
        int n=3,m=3;
        int totalpaths=countpaths(0, 0, m, n);
        System.out.println(totalpaths);
    }
}