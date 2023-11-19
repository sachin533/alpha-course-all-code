public class Subroottree {

  static class Node {

    Subroottree.Node data;
    Node left, right;

    public Node(int data) {
      this.data = data;
      Node left = null;
      Node right = null;
    }
  }

 public static boolean isIdentical(Node node, Node subRoot) {
        if (node == null && subRoot == null) {
            return true;
        } else if (node == null || subRoot == null || node.data != subRoot.data) {
            return false;
        }

        if (!isIdentical(node.data, subRoot.data)) {
            return false;
        }

        if (!isIdentical(node.data, subRoot.data)) {
            return false;
        }

        return true;
    }

    private static boolean isIdentical(int data, int data2) {
    return false;
}

    public static boolean isSubtree(Node root, Node subRoot) {
        if (root == null) {
            return false;
        }

        if (root.data == subRoot.data && isIdentical(root, subRoot)) {
            return true;
        }

        return isSubtree(root.data, subRoot) || isSubtree(root.data, subRoot);
    }



  public static void main(String args[]) {
    /* 
                    1
                   / \
                  2   3
                 / \ / \
                4  5 6  7
         
        */

    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right.left = new Node(6);
    root.right.right = new Node(7);

 /* 
                  2   
                 / \  
                4   5   
*/

    Node subRoot = new Node(2);
    subRoot.left = new Node(4);
    subRoot.right = new Node(5);


    System.out.print(isSubtree(root, subRoot));
  }
}
