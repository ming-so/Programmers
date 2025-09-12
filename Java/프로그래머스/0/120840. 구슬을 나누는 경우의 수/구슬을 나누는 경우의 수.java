class Solution {
    public int solution(int balls, int share) {
        double answer = 1;
        double temp = 1;
        
        for (int i = balls; i > share; i--) answer *= i;
        for (int i = balls - share; i > 0; i--) temp *= i; 
        
        return (int) (answer / temp);
    }
}