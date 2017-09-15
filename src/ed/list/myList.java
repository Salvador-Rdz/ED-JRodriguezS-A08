/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.list;

/**
 *
 * @author Salvador
 */
public class myList<T> {
    Node first;
    Node last;
    Node pointer;
    
    public myList()
    {
        first  = null;
        last=null;
        pointer=null;
    }
    myList (T data)
    {
        Node node = new Node(data);
        first = node;
        last = node;
        node.next = null;
    }
    public boolean isEmpty()
    {
        return first==null;
    }
    public void insertFirst(T d)
    {
        Node node = new Node(d);
        if(isEmpty())
        {
            first = node;
            last = node;
            node.next=null;
        }
        else
        {
            node.next=first;
            first=node;
        }
    }
    public void insertLast(T d)
    {
        Node node = new Node(d);
        if(isEmpty())
        {
            first = node;
            last = node;
            node.next=null;
        }
        else
        {
            last.next = node;
            last = node;
        }
    }
    public void deleteFirst()
    {
        if(!isEmpty())
        {
            if(first.next==null)
            {
                first=null;
                last=null;
            }
            else
            {
                first=first.next;
            }
        }
    }
    public void deleteLast()
    {
        if(!isEmpty())
        {
            if(first==last)
            {
                first=last=null;
            }
            else
            {
                pointer=first;
                while(pointer.next!=last)
                {
                    pointer=pointer.next;
                }
                last = pointer;
                last.next = null;
                pointer = null;
            }
        }
    }
    //Eliminar nodo
    public boolean deleteNode(T n)
    {
       Node p=fetchBack(n);
       if(p!=null)
       { 
            if(fetchBack(n).data==n)
            { 
                deleteFirst();
            }
            else
            { 
                p.next=p.next.next;            
            }
       return true;
       }
    return false;    
    }
    
    public Node fetch(T n)
    {
        if(!isEmpty())
        {
            if(first.data==n)
            {
                return first;
            }
            else
            {
                Node node = fetchBack(n); //Uses fetchBack to receive the node before the one we're searching for.
                if(node!=null) //If it it doesn't return null, it means it has found it.
                {
                    return node.next; //Then, sends the next one so we receive the actual node
                }   
            }
        }
        return null;
    }
    public Node fetchBack(T n)
    {
        pointer=first;
        if(!isEmpty())
        {
            if(first==last)
            {
                if(first.data==n)
                {
                    return first;
                }
                else
                { 
                    return null;
                }
            }
            else
            {
                if(first.data==n)
                {
                  return first;
                }
                else
                {
                    pointer=first;
                    while(pointer.next!=null)
                    {
                        if(pointer.next.data==n)
                        {
                            return pointer; 
                        }
                        pointer=pointer.next;
                    } 
                }   
            }
        }
        return null;
    }
}
