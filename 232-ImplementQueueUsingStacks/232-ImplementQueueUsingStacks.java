// Last updated: 12/28/2025, 4:53:47 PM
class MyQueue {
    Queue<Integer> q;
    public MyQueue() {
        q=new LinkedList<>();
    }
    
    public void push(int x) {
        q.add(x);
    }
    
    public int pop() {
        if(q.isEmpty())
            return 0;
        int x=q.poll();
        return x;
    }
    
    public int peek() {
       int x= q.peek();
       return x;
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */