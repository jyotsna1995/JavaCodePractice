package bst;

class Node {
	int data;
	Node left;
	Node right;
	
	Node(int data){
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
class BinarySearchTree{
	Node root;
	
	BinarySearchTree(){
		this.root=null;
	}
	
	void insertD(int data){
		Node newNode = new Node(data);
		
		if(this.root==null) {
			this.root= newNode;
		}
		else {
			this.root=insertData(this.root,newNode);
		}
	}
	
	Node insertData(Node node,Node newNode) {
		if(newNode.data < node.data) {
			if(node.left==null) {
				node.left=newNode;
			}
			else {
				insertData(node.left,newNode);
			}
		}
		else {
			if(node.right==null) {
				node.right=newNode;
			}
			else {
				insertData(node.right,newNode);
			}
		}
		return node;
	}
	
	void inOrderTvl(Node node) {
		  if(node != null)
		    {
		        this.inOrderTvl(node.left);
		        System.out.println(node.data);
		        this.inOrderTvl(node.right);
		    }
		
	}
}
public class BstPractice {
	public static void main(String args[]) {
		BinarySearchTree bste  = new BinarySearchTree();
		bste.insertD(5);
		bste.insertD(4);
		bste.insertD(7);
		bste.insertD(9);
		bste.insertD(10);
		bste.insertD(6);
		
		bste.inOrderTvl(bste.root);
	}
	
	
}

