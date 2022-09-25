class MyCircularQueue {
    
    int [] array;
    int used;
    int size;
    int front;
    int rear;
    public MyCircularQueue(int k) {
        array = new int[k];
        size=k;
    }
    
    public boolean enQueue(int value) {
        if(isFull())
            return false;
        array[rear] = value;
        rear = (rear+1)%size;
        used++;
        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty())
            return false;
        front = (front+1)%size;
        used -- ;
        return true;
    }
    
    public int Front() {
        if(isEmpty())
            return -1;
        return array[front];
    }
    
    public int Rear() {
         if(isEmpty())
            return -1;
        return array[(rear-1+size)%size];
    }
    
    public boolean isEmpty() {
        return used==0;
    }
    
    public boolean isFull() {
        return used == size;
    }
}
