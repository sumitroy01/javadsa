public class z {
    
    private Node root;
    private class Node{
        int value;
        Node right;
        Node left;

        public Node(int Value){
            this.value=value;
        }
    }

    public void populate(int value){
        root=populate(value,root);
    }

    public Node populate(int value,Node current){
        if (current==null) {
           return new Node(value);
        }

        if (value>current.value) {
        return current.right=populate(value, current.right);
        }

        if (value<current.value) {
          return current.right=populate(value, current.left);
        }

        return current;
    }

    public void display(){
        display(root);
    }

    public void display(Node current){
        if (current==null) {
            return;
        }
        display(current.left);
        System.out.println(current.value);
        display(current.right);
    }

    public int height(){
        return height(root);
    }

    public int height(Node current){
        if (current==null) {
            return -1;
        }
        int lefth=height(current.left);
        int righth=height(current.right);

        return 1+(Math.max(lefth, righth));
    }

    public Boolean search(int val){
        return search(val,root);

    }
    public Boolean search(int val,Node current){
        if (current==null) {
            return false;
        }

        if (val==current.value) {
            return true;
        }else if(val>current.value){
           return  search(val, current.right);
        }else{
           return  search(val,current.left);
        }
    }

    public void delete(int val){
         root=delete(val,root);
    }
    public Node delete(int val,Node current){
       if (current==null) {
        return null;
       }

       if (val>current.value) {
        current.right=delete(val, current.right);
       }else if (val<current.value) {
        current.left=delete(val, current.left);
       }else{

        if (current.left==null) {
            return current.left;
        }
        if (current.right==null) {
            return current.left;
        }

       }
        return null;
    }

    private int findMin(Node node){
        int minval=node.value;
        while (node.left!=null) {
            node=node.left;
            minval=node.value;
        }
        return minval;
    }


}
