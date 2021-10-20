package com.example.algopractice.Trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreorderIterativeTrav {

	public static void main(String args[]) {
		Tree tree = new Tree();
		TreeNode root = tree.createTree();
		System.out.println("Pre order traversal");
		PreorderIterTrav(root);
		System.out.println();
		System.out.println("Inorder traversal");
		InOrderIterTrav(root);
		System.out.println("Post order traversal");
		PostOrderIterTrav(root);

	}

	private static void PostOrderIterTrav(TreeNode root) {
		// TODO Auto-generated method stub
		
		TreeNode node=root;
		Stack<TreeNode> stack1=new Stack();
		Stack<TreeNode> stack2=new Stack();
		
		stack1.push(node);
		while(!stack1.isEmpty())
		{
			
			TreeNode temp=stack1.pop();
			stack2.add(temp);
			if(temp.getLeft()!=null)
			{
				stack1.push(temp.getLeft());
			}
			if(temp.getRight()!=null)
			{
				stack1.push(temp.getRight());
			}
			
		}
		
		while(!stack2.isEmpty())
		{
			int elem=stack2.pop().getData();
			System.out.print(elem);
		}
		
		
	}

	private static void InOrderIterTrav(TreeNode root) {
		// TODO Auto-generated method stub

		Stack<TreeNode> stack = new Stack<>();
		stack.push(root);
        TreeNode node=root;
		while(true)
		{
			if(node!=null)
			{
				stack.push(node);
				node=node.getLeft();
			}else
			{
				if(stack.isEmpty())
				{
					break;
				}
				
				node=stack.pop();
				System.out.print(node.getData());
				node=node.getRight();
				
			}
			
			
			
		}
		
		
	}

	public static void PreorderIterTrav(TreeNode root) {
		// TODO Auto-generated method stub

		Stack<TreeNode> stack = new Stack<>();
		stack.push(root);

		while (!stack.isEmpty()) {
			TreeNode temp = stack.pop();
			System.out.print(temp.getData());
			if (temp.getRight() != null) {
				stack.push(temp.getRight());
			}
			if (temp.getLeft() != null) {
				stack.push(temp.getLeft());
			}
		}
	}

}
