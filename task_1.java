class Solution {
    public double myPow(double x, int n) {
        int count = 0;
        double rez = 1;
        if (n > 0) {
            while (count++ < n) rez *= x;
        }
        if (n < 0) {
            while (count-- > n) rez /= x;
        }
        if (n == 0) rez = 1;
        
        return rez;
    }
}