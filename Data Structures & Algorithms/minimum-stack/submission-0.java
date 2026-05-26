class MinStack {

    private int min;
    private int top;
    private ArrayList<Integer> list;

    public MinStack() {
        min = Integer.MAX_VALUE;
        top = 0;
        list = new ArrayList<>();
    }
    
    public void push(int val) {
        this.list.add(val);
        if (val < this.min) {
            this.min = val;
        }
    }
    
    public void pop() {
        this.list.remove(list.size()-1);
        int t = Integer.MAX_VALUE;
        for (int c : this.list) {
            if (c < t) {
                t = c;
            }
        }
        min = t;
    }
    
    public int top() {
        return this.list.get(list.size()-1);
    }
    
    public int getMin() {
        return this.min;
    }
}
