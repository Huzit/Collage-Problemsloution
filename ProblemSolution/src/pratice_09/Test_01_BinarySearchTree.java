package pratice_09;

import java.util.LinkedList;

public class Test_01_BinarySearchTree {
	class BinaryTree {
		int key;
		BinaryTree left, right;

		public BinaryTree(int key) {
			this.key = key;
		}

		@Override
		public String toString() {
			return Integer.toString(key);
		}
	}

	BinaryTree root;

	public void add(int key) {
		root = add(root, key);
	}

	private BinaryTree add(BinaryTree tree, int key) {
		if (tree == null)
			return new BinaryTree(key);
		if (tree.key < key)//대표 설명 : root를 tree로 받아서 tree의 변수인 right(방향)에 새로운 방향변수와 키값을 저장
			tree.right = add(tree.right, key);//즉 객체에 객체에 객체에 객체를 생성하는 방식 연달아 생성한다.
		else if (tree.key > key)
			tree.left = add(tree.left, key);
		else
			; // value 삽입 시 else tree.value=value;
		return tree;
	}
	

	public BinaryTree search(int key) {
		BinaryTree node = root;
		while (node != null) {
			if (node.key == key)
				return node;
			if (node.key < key)
				node = node.right;
			else
				node = node.left;
		}
		return node;
	}
	
//	public BinaryTree search(int key) {
//		BinaryTree node = root;
//		if(node.key==key)return node;
//		return searchRecur(node, key);
//	}
//	public BinaryTree searchRecur(BinaryTree node, int key) {
//		if(node==null || node.key==key)return node;
//		return node.key<key ? searchRecur(node.right, key) : searchRecur(node.left, key);
//	}

	@Override
	public String toString() {
		return levelOrder().toString();
	}

	private LinkedList<BinaryTree> levelOrder() {
		LinkedList<BinaryTree> list = new LinkedList<>();
		LinkedList<BinaryTree> queue = new LinkedList<>();
		if (root != null)
			queue.addLast(root);
		while (!queue.isEmpty()) {
			BinaryTree node = queue.removeFirst();
			list.add(node);
			if (node.left != null)
				queue.addLast(node.left);
			if (node.right != null)
				queue.addLast(node.right);
		}
		return list;
	}
	public static String inorder(BinaryTree tree) {
		if(tree==null) return "";
		return inorder(tree.left)+" "+ tree.key +" "+inorder(tree.right);
	}
}
