class Solution {
    int isPalindrome(String S) {
        // code here
        String R="";
        for(int i=S.length()-1;i>=0;i--)
        {
         R+=S.charAt(i);   
        }
        if(R.equals(S))
        {
            return 1;
        }
        return 0;
    }
};



class Solution {
    int isPalindrome(String S) {
        int i=0,j=S.length()-1;
        // code here
        while(i<j)
        {
            if(S.charAt(i)!=S.charAt(j))
            {
                return 0;
            }
            i++;
            j--;
        }
        return 1;
    }
};
