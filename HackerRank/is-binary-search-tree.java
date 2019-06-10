/* Hidden stub code will pass a root argument to the function below. Complete the function to solve the challenge. Hint: you may want to write one or more helper functions.  

The Node class is defined as follows:
    class Node {
        int data;
        Node left;
        Node right;
     }
*/  
    boolean checkBSTrange(Node root, int minimum, int maximum){
        if (root != null){
            if ((root.data >= 0) && (root.data <= Math.pow(10,4)))
                if (root.data < minimum || root.data > maximum)
                    return false;
        }else
            return true;
        return (checkBSTrange(root.left, minimum, root.data-1) &&
            checkBSTrange(root.right, root.data+1, maximum));
    }

    boolean checkBST(Node root) {
        return checkBSTrange(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
