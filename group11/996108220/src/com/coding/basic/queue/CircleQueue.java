package com.coding.basic.queue;

/**
 * 用数组实现循环队列
 * @author liuxin
 *
 * @param <E>
 */
public class CircleQueue <E> {
	
	private final static int DEFAULT_SIZE = 10;
	
	//用数组来保存循环队列的元素
	private Object[] elementData = new Object[DEFAULT_SIZE] ;
	
	//队头
	private int front = 0;  
	//队尾  
	private int rear = 0;
	
	public boolean isEmpty() {
		return front==rear;
        
    }

    public int size() {
        return (rear-front)%DEFAULT_SIZE;
    }

    

    public void enQueue(E data) {
        if ((rear+1)%DEFAULT_SIZE==front) {
			throw(new ArrayIndexOutOfBoundsException());
		}
        else {
			elementData[rear]=data;
			rear=(rear+1)%DEFAULT_SIZE;
		}
    }

    public E deQueue() {
    	if (isEmpty()) {
    		throw(new NullPointerException());
    		
		}
    	else {
    		int index=front;
    		front=(front+1)%DEFAULT_SIZE;
			return (E) elementData[index] ;
		}
       
    }
}
