package com.bridge.BinarySearchTree;
/*
 * @author : Shubham BOhari
 * 
 * */
public class BinarySearchTree {
	Node root;
	Node node;
	
	
	// This method mainly calls insertRec() 
    void insert(int key) { 
       root = insertRec(root, key); 
    } 
	
	/***********To add at apropriate position*******/
	 /* A recursive function to insert a new key in BST */
    Node insertRec(Node root, int key) { 
  
        /* If the tree is empty, return a new node */
        if (root == null) { 
            root = new Node(key); 
            return root; 
        } 
  
        /* Otherwise, recur down the tree */
        if (key < root.key) 
            root.left = insertRec(root.left, key); 
        else if (key > root.key) 
            root.right = insertRec(root.right, key); 
  
        /* return the (unchanged) node pointer */
        return root; 
    } 
	
	
    
    
    
	  // A utility function to do inorder traversal of BST 
    public  void inorderRec(Node root) { 
        if (root != null) { 
            inorderRec(root.left); 
            System.out.println(root.key); 
            inorderRec(root.right); 
        } 
    } 
    // This method mainly calls InorderRec() 
    void inorder()  { 
       inorderRec(root); 
    } 
}
