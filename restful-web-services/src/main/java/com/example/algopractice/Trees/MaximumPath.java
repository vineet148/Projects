package com.example.algopractice.Trees;

public class MaximumPath {

	public static void main(String args[])
	{
		Tree tree1 = new Tree();
		TreeNode root = tree1.createTree();
		int[] max=new int[1];
		
		findMaximumPath(root,max);
		System.out.println(max[0]);
		
	}

	private static int findMaximumPath(TreeNode root, int[] maxi) {
		// TODO Auto-generated method stub
		
		if(root==null)
			return 0;
		
		int left=findMaximumPath(root.getLeft(),maxi);
		int right=findMaximumPath(root.getRight(),maxi);
		
		maxi[0]=Math.max(maxi[0], left+right+root.getData());
		
		return root.getData()+ Math.max(left,right);
		
		
	}
	
}
