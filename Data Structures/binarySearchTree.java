import java.util.Iterator;

@SuppressWarnings("unused")
public class binarySearchTree <T extends Comparable<T>>{
    
    private int nodeCount=0;
    private Node root=null;

    private class Node {
        T data;
        Node left,right;

        public Node (Node left, Node right, T elem){
            this.data=elem;
            this.left=left;
            this.right=right;
        }
    }

    public boolean isEmpty(){
        return size()==0;
    }

    public int size(){
        return nodeCount;
    }

    public boolean add(T elem){
        if(contains(elem)){
            return false;
        }

        else{
            root=add(root,elem);
            nodeCount++;
            return true;
        }
        
    }

    private Node add(Node node,T elem){
        
        if(node==null){
            node=new Node(null,null,elem);
        }

        else{
            if(elem.compareTo(node.data)<0){
                node.left=add(node.left,elem);
            }
            else{
                node.right=add(node.right,elem);
            }
        }

        return node;

    }

    public boolean remove(T elem){
        if(contains(elem)){
            root=remove(root,elem);
            nodeCount--;
            return true;
        }

        return false;
    }

    private Node remove(Node node,T elem){

        if (node==null) {
            return null;
            
        }

        int cmp=elem.compareTo(node.data);

        if(cmp<0){
            node.left=remove(node.left, elem);
        }

        else if(cmp>0){
            node.right=remove(node.right, elem);
        }

        else{
            if(node.left==null){
                Node rightChild=node.right;
                node.data=null;
                node=null;
                return rightChild;
            }

            else if(node.right==null){
                Node leftChild=node.left;
                node.data=null;
                node=null;
                return leftChild;
            }

            else{

                Node tmp=digLeft(node.right);
                node.data=tmp.data;
                node.right=remove(node.right, tmp.data);
            }
        }

        return node;
    }

    private Node digLeft(Node node){

        Node cur=node;
        while (cur.left!=null) {
            cur=cur.left;
        }
        return cur;

    }

     
    private Node digRight(Node node){

         Node cur=node;
         while (cur.right!=null) {
             cur=cur.right;
         }
         return cur;

     }

    public boolean contains(T elem){
        return contains(root,elem);
    }

    private boolean contains(Node node,T elem){

        if(node==null){
            return false;
        }

        int cmp=elem.compareTo(node.data);

        if(cmp<0){
            return contains(node.left, elem);
        }

        else if (cmp>0){
            return contains(node.right,elem);
        }

        else{
            return true;
        }
    }

    public int height(){
        return height(root);
    }

    private int height(Node node){
        if(node==null){
            return 0;
        }
        return Math.max(height(node.left),height(node.right))+1;
    }

    public java.util.Iterator<T> levelOrderTraversal(){
        final int expectedNodeCount=nodeCount;
        queue<Node> queue=new queue<>();
        queue.offer(root);

        return new java.util.Iterator<T>(){
            @Override
            public boolean hasNext(){
                if(expectedNodeCount!=nodeCount){
                    throw new java.util.ConcurrentModificationException();
                }
                return root!=null && !queue.isEmpty();
            }
                @Override
                public T next(){
                    if(expectedNodeCount!=nodeCount){
                        throw new java.util.ConcurrentModificationException();

                    }
                    Node node=queue.poll();
                    if(node.left!=null){
                        queue.offer(node.left);
                    }
                    if(node.right!=null){
                        queue.offer(node.right);
                    }
                    return node.data;
                } 
            
        };

    }




    @Override
    public String toString(){
        if(isEmpty()){
            return "[]";
        }

        StringBuilder sb=new StringBuilder();
        sb.append("[");

        queue<Node> queue=new queue<>();
        queue.offer(root);

        while (!queue.isEmpty()) {

            Node node=queue.poll();

            sb.append(node.data);

            if(node.left!=null){
                queue.offer(node.left);
            }

            if(node.right!=null){
                queue.offer(node.right);
            }

            if(!queue.isEmpty()){
                sb.append(", ");
            }
            
        }

        sb.append("]");
        return sb.toString();


    }

   



    
}
