class Solution {
    public boolean isPalindrome(String s) {

        int length = 0, sz = s.length() - 1;
        s = s.toLowerCase();

        while (length < sz)
        {
            while (length < sz && !alphaNum(s.charAt(length))){
                length++;
            }           // move length pointer if length is < size AND it's not a alphanumeric (A-Z, 0-9)
            while (sz > length && !alphaNum(s.charAt(sz)))
            {
                sz--;
            }       // move sz pointer backward when sz is greater than length and it's not alphanumeric
            if (Character.toLowerCase(s.charAt(length)) != Character.toLowerCase(s.charAt(sz)))
            {
                return false;
            }
            length++; sz--;

        }
        return true;
    }

    public boolean alphaNum(char c)
    {
        return (c >= 'a' && c <= 'z' ||
            c >= '0' && c <= '9');
    }
}
