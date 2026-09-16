class MinStack {
    Stack<Integer> alldata;
    Stack<Integer> mindata;

    public MinStack() {
        alldata=new Stack<>();
        mindata=new Stack<>();
    }
    
    public void push(int value) {
        alldata.push(value);
        if(mindata.size()==0 || value<=mindata.peek())
        mindata.push(value);
    }
    
    public void pop() {
        int val=alldata.pop();
        if(val==mindata.peek())
        mindata.pop();
    }
    
    public int top() {
        return alldata.peek();
    }
    
    public int getMin() {
        return mindata.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */