    /****
	  *Use an additional stack to keep track of the mins
	  **/

    public class StackWithMin extends Stack<Integer>{
    	Stack<Integer> s;

    	public StackWithMin(){
    		s=new Stack<Integer>();
    	}

    	public void push(int value){
    		if(value<=min())
    			s.push(value);
    		super.push(value);
    	}

    	public Integer pop(){
    		int value=super.pop();
    		if(value==min())
    			s.pop();
    		return value;
    	}

    	public int min(){
    		if(s.isEmpty())
    			return Integer.MAX_VALUE;
    		else
    			return s.peek();
    	}

    }
