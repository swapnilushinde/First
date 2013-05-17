package org.com;

public class BST {
	//private Node root = null;
	private int[] a;
	
	public BST (int[] x){
		//root = r;
		a = x;
	}
	
	public Node buildMinBST(int start, int end){
		if((end - start) == 1){
			Node n1 = new Node();
			n1.data = a[start];
			Node n2 = new Node();
			n2.data = a[end];
			n1.right = n2;
			return n1;
		}
		if((start-end) == 0){
			Node n1 = new Node();
			n1.data = a[start];
			return n1;
		}
		int mid = (start+end) / 2;
		
		Node leftChild = buildMinBST(start, mid-1);
		Node rightChild = buildMinBST(mid+1, end);
		Node r = new Node();
		r.data = a[mid];
		r.left = leftChild;
		r.right = rightChild;
		
		return r;
	}
	
	public int getHeight(Node n){
		if(n==null){
			return 0;
		}
		
		int h = Math.max(getHeight(n.left), getHeight(n.right))+1;
		return h;
		
	}
	
	public void inOrder(Node n){
		if (n == null){
			return;
		}
		
		inOrder(n.left);
		System.out.println(n.data);
		inOrder(n.right);
	}
	
	public void preOrder(Node n){
		if (n == null){
			return;
		}
		
		System.out.println(n.data);
		preOrder(n.left);
		preOrder(n.right);
	}
}
