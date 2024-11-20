class SolutionOfString {


    //Given two integers N and K, return a palindrome of length N which consists K distinct lower case letters()a-z
    //eg. given N=8,k=3 your function may return "ppsccspp"
    static String sol (int N, int K) {
        char[] map = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char[] ans = new char[N];

        for (int i = 0, start = 0, end = ans.length-1; start <= end; start++,end--) {
            ans[start] = map[i];
            ans[end] = map[i];
            System.out.println(":" + ans[start] + " :"+ans[end] +":" +(i+1)% K);
            i = (i+1) % K;
        }

        return new String(ans);
    }

    static boolean isPalindrome(String s) { // Just to check if solution if Ok
        for (int start = 0, end = s.length()-1; start < end; start++, end--) {
            if (s.charAt(start) != s.charAt(end)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
         int N = 8, K = 3;  // eg 2
        // int N = 3, K = 2;
        String s = sol(N, K);
        System.out.println(s);
        System.out.println(isPalindrome(s)); // true
    }
}