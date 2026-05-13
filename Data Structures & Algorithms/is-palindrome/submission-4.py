class Solution:
    def isPalindrome(self, s: str) -> bool:
        string = ''

        for i in range(0, len(s)):
            if s[i].isalnum():
                string += s[i].lower()
        return string == string[::-1]


            
