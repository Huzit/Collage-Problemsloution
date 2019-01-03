package pratice_09;

import java.util.LinkedList;

public class Test_01 {
	public static void main(String[] args) {
		Test_01_BinarySearchTree tree=new Test_01_BinarySearchTree();
		int n[]={50,20,70, 10, 30};
		for (int i = 0; i < n.length; i++) tree.add(n[i]);
		System.out.println(tree.search(30));
		System.out.println(tree.search(33));
		System.out.println(Test_01_BinarySearchTree.inorder(tree.root));
	}
}
