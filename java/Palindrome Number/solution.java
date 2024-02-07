class Solution {
    public boolean isPalindrome(int x) {
        int new_x = x;
        int temp = 0, remainder;

        if (x < 0) {
            return false;
        }
        
        while (x != 0) {
            remainder = x % 10; 
            temp = temp * 10 + remainder;
            x /= 10;
        }
        
        return new_x == temp;
    }
}
