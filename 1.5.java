    public String solution(String str) {
        int size=count(str);
        if(size>=str.length())
            return str;
        
        StringBuffer buffer=new StringBuffer();
        int count = 1;
        char last = str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            if (last == str.charAt(i)) {
                count++;
            } else {
                buffer.append(last);
                buffer.append(count);
                count = 1;
                last = str.charAt(i);
            }
        }
        buffer.append(last);
        buffer.append(count);
        return buffer.toString();
    }
    
    public int count(String str){
        if(str ==null|| str.isEmpty())
            return 0;
        int size=0;
        int count=1;
        char last=str.charAt(0);
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==last){
                count++;
            }else{
                last=str.charAt(i);
                size+=1+String.valueOf(count).length();
                count=1;
            }
        }
        size+=1+String.valueOf(count).length();
        return size;
    }
