public boolean solution(String st1,String st2){
    if(st1.length()!=st2.length())
        return false;
    int len=st1.length();
    int[] count=new int[256];
    
    char[] char1=st1.toCharArray();
    for(int i=0;i<len;i++){
        int index=char1[i];
        count[index]++;
    }
    
    for(int i=0;i<len;i++){
        int index=str2.charAt(i);
        if(--count[index]<0)
            return false;
    }
    return true;
}
