    public boolean solution(String str1, String str2){
        int len = str1.length();
        if (len == str2.length() && len > 0) {
            String str = str1 + str1;
            return isSubString(str, str2);
        }
        return false;
    }
    
    public boolean isSubstring(String str1, String str2){
        /***/
    }
