package aarmanyaa;


public class driver {
	
		
	
	// Driver Code
	public static void main (String[] args)
	{
		FFG tree = new FFG();
		tree.node = new Node(40);
		tree.node.	left = new Node(30);
		tree.node.right = new Node(60);
		tree.node.left.left = new Node(10);
		tree.node.right.left = new Node(50);

		int order = 0;
		Object node = null;
		flattenBTToSkewed(node, order);
		Object headNode = null;
		traverseRightSkewed(headNode);
	}

	private static void traverseRightSkewed(Object headNode) {
		// TODO Auto-generated method stub
		
	}

	private static void flattenBTToSkewed(Object node, int order) {
		// TODO Auto-generated method stub
		
	}
}


