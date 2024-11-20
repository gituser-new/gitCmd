public class MinimumNumberOfGlasses {

    //there are N empty glasses with a capacity of 1,2,3...N liters(there is exactly one glass
    // of each unique capacity). you want to pour exactly K liters of water into the glass.Each glass may b either full or empty.
    //What is the minimum no of glasses that u need to contain K liters of water
    //https://leetcode.com/discuss/interview-question/1321793/codility-assessment-questions-2021

    static int solution(int N, int K) {
        int ans = 0;
        for (int i = N; K > 0 && i > 0; i--) {
            if (i <= K) {
                ans++;
                K -= i;
            }
        }
        return K == 0 ? ans : -1;
    }

    public static void main(String[] args) {
        System.out.println(solution(5, 8)); // 2
        System.out.println(solution(4, 10)); // 4
        System.out.println(solution(1, 8)); // -1
        System.out.println(solution(10, 5)); // 1
        // N 1..1,000,000
    }

}