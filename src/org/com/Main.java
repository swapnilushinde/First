package org.com;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14};
		BST bst = new BST(a);
		Node r = bst.buildMinBST(0, a.length-1);
		
		bst.inOrder(r);
		System.out.println(bst.getHeight(r));
	}

}
