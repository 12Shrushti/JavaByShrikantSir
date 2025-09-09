class BinaryTree<E>{
	Node<E> root;
	static class Node<E>{
		E ele;
		Node<E> left , right;
		Node(E ele){
			this.ele=ele;
		}
	}
	void preorder(Node<E> root) {
        if(root == null) return;

            System.out.print(root.ele + " ");
            preorder(root.left);
            preorder(root.right);
        
    }
    void postOrder(Node<E> root){
    	if(root == null) return;
    	postOrder(root.left);
    	postOrder(root.right);
    	System.out.println(root.ele);
    }
    void inOrder(Node<E> root){
    	if(root == null) return;
    	inOrder(root.left);
    	System.out.println(root.ele);
    	inOrder(root.right);
    	
    }
}


class TreeDriver{
	public static void main(String[] args) {
		BinaryTree<Character> tree = new BinaryTree<>();
		tree.root=new BinaryTree.Node<Character>('A');
		tree.root.left = new BinaryTree.Node<Character>('B');
		tree.root.right= new BinaryTree.Node<Character>('C');
		tree.root.left.left = new BinaryTree.Node<Character>('D');
		tree.root.left.right =new BinaryTree.Node<Character>('E');
		tree.root.right.left = new BinaryTree.Node<Character>('F');
		tree.root.right.right = new BinaryTree.Node<Character>('G');
		System.out.println();
		tree.preorder(tree.root);
		System.out.println("Post Order: ");
		System.out.print("\n_________________________\n");
		tree.postOrder(tree.root);
		System.out.println("In Order: ");
		System.out.print("\n_________________________\n");
		tree.inOrder(tree.root);

	}

}