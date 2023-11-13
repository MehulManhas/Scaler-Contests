//https://www.scaler.com/test/c2f0d2ef6b/#/problem_2
public class VowelsInRange {
    public int[] solve(String A, int[][] B) {
        int[] vowelCounts = createVowelArray(A);

        int[] ans = new int[B.length];

        for(int i=0; i<B.length; i++){
            int start = B[i][0];
            int end = B[i][1];

            ans[i] = executeQueries(vowelCounts, start, end);
        }

        return ans;
    }

    public int[] createVowelArray(String A){
        int[] vowelCounts = new int[A.length()];

        vowelCounts[0] = isVowel(A.charAt(0)) ? 1 : 0;

        for(int i=1; i<A.length(); i++){
            if(isVowel(A.charAt(i))){
                vowelCounts[i] = vowelCounts[i-1] + 1;
            }
            else{
                vowelCounts[i] = vowelCounts[i-1];
            }
        }

        return vowelCounts;
    }

    public boolean isVowel(char c){

        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
            return true;
        }
        return false;
    }

    public int executeQueries(int[] vowelCounts, int start, int end){

        if(start == 0){
            return vowelCounts[end];
        }

        return vowelCounts[end] - vowelCounts[start-1];
    }
}
