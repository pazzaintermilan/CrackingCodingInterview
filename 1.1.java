    /*****
     * bit computation
     * runtime & space
     * runtime O(N)
     * space O(1)
     * *****/
     
    public void solution1(String s){
        int[] bit=new int[8];
        for(int i=0;i<s.length();i++){
            int val=s.charAt(i);
            int index=val/32;
            int shift=val%32;
            if((bit[index]&(1<<shift))>0)
                return false;
            bit[index]|=(1<<shift);
        }
        return true;
    }
    
    /****
     * ASCII 256 chars
     * runtime O(n)
     * space O(1)
     * ***/
    public void solution2(String s){
        if(s.length()>256)
            return false;
        boolean[] char_set=new boolean[256];
        for(int i=0;i<s.length();i++){
            int val=s.charAt(i);
            if(char_set[val])
                return false;
            char_set[val]=true;
        }
        return true;
    }
