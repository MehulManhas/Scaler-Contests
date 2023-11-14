public class ConstructBinaryNumber {
    public int solve(int A, int B) {

        if(A == 0){
            return 0;
        }

        int maxPower = A+B-1;

        int ans = 0;

        while (maxPower >= B){
            ans = ans + (1<<maxPower);
            maxPower--;
        }

        return ans;
    }
}
