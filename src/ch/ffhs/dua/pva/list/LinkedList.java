package ch.ffhs.dua.pva.list;

import java.util.Iterator;
import java.util.List;

public class LinkedList<E> extends ListBasic<E> implements List<E>
{

	Node head;
	
	public LinkedList() 
	{
		head = new Node(null);
	}
    
	
	@Override
    public int size()
    {
        // TODO
    	return 0;
    }

    @Override
    public boolean isEmpty()
    {
        // TODO
    	return false;
    }
    
    @Override
    public E get(int index)
    {
        Node currentNode = head;
    	for(int i = 0; i < index ; i++) {
//        	if(!currentNode.hasNext()) {
//        		return null;
//        	}
        	
        	currentNode = currentNode.next;
        	
        }
    	return (E) currentNode.getElement();
    }


    @Override
    public E set(int index, E element)
    {
        // TODO
        return null;
    }
    
    
    @Override
    public boolean add(E element)
    {
        
    	Node newNode = new Node(element);
    	head.next = newNode;
    	
        return true;
    }

    @Override
    public void add(int index, E element)
    {
        //TODO     
    }

    
    public boolean contains(Object o)
    {
        // TODO
    	return false;
    }

    @Override
    public E remove(int index)
    {
        // TODO
        return null;
    }
    
    @Override
    public boolean remove(Object o)
    {
        // TODO
    	return false;
    }

    @Override
    public void clear()
    {
        // TODO
    }

    @Override
    public Iterator<E> iterator()
    {
        return new LinkedListIterator();
    }
    
///////////////////////////////////////////////////
    
   

    private static class Node<E>
    {
        private E element;
        Node<E> next;
        Node<E> prev;
        
        public Node(E element) {
        	this.element = element;
        	next = null;
        	prev = null;
        }
        
        public boolean hasNext() 
        {
        	if(this.next == null) {
        		return false;
        	}
        	return true;
        }

		public E getElement() {
			return element;
		}

		public void setElement(E element) {
			this.element = element;
		}
    }
    
    private class LinkedListIterator implements Iterator<E>
    {
       
        @Override
        public boolean hasNext()
        {
            // TODO
        	return false;
        }

        @Override
        public E next()
        {
            // TODO
            return null;
        }
        
        @Override
        public void remove()
        {
           // TODO
        }
    }
    

}
