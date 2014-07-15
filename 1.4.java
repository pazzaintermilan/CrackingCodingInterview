public void  solution(char[] ch, int length){
    int newLength=0,spaceCount=0;
    for(int i=0;i<length;i++){
        if(ch[i]==' ')
            spaceCount++;
    }
    
    newLength=length+spaceCount*2;
    ch[newLength]='\0';
    for(int i=length-1;i>=0;i--){
        if(ch[i]=' '){
            ch[newLength-1]='0';
            ch[newLength-2]='2';
            ch[newLength-3]='%';
            newLength--;
        }else{
            ch[newLength-1]=ch[i];
            newLength--;
        }
    }
 
}
