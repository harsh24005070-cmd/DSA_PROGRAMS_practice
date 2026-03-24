package DSA_PROGRAMS.Tree;
import java.util.*;
public class BinaryTreeLastPractice {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            left=null;
            right=null;
        }
    }

    public static void display(Node root){
        if(root==null) return;
        System.out.print(root.data+" -> ");
        if(root.left==null){
            System.out.print("null , ");
        }else{
            System.out.print(root.left.data+" , ");
        }
        if(root.right==null){
            System.out.print("null\n");
        }else{
            System.out.print(root.right.data+"\n");
        }
        display(root.left);
        display(root.right);
    }

    public static int size(Node root){
        if(root==null) return 0;
        return size(root.left)+size(root.right)+1;
    }
    public static int sum(Node root){
        if(root==null) return 0;
        return sum(root.left)+sum(root.right)+root.data;
    }
    public static int max(Node root){
        if(root==null) return Integer.MIN_VALUE;
        return Math.max(max(root.left),Math.max(max(root.right),root.data));
    }
    public static int height(Node root){
        if(root==null) return -1;
        return Math.max(height(root.left),height(root.right))+1;
    }
    public static void preorder(Node root){
        if(root==null) return ;
        System.out.print(root.data+"  ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(Node root){
        if(root==null) return ;
        inorder(root.left);
        System.out.print(root.data+"  ");
        inorder(root.right);
    }
    public static void postorder(Node root){
        if(root==null) return ;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+"  ");
    }
    public static void nthLevel(Node root,int n){
        if(root==null) return ;
        if(n==1) System.out.print(root.data+"  ");
        nthLevel(root.left,n-1);
        nthLevel(root.right,n-1);
    }
    public static void bfs(Node root){
        Queue<Node> q=new LinkedList<>();
        if(root!=null) q.add(root);
        while(!q.isEmpty()){
            Node temp=q.poll();
            if(temp.left!=null) q.add(temp.left);
            if(temp.right!=null) q.add(temp.right);
            System.out.print(temp.data+"  ");
        }
    }
    

    
    public static void main(String[] args) {
        Node root=new Node(1);
        Node a=new Node(2);
        Node b=new Node(3);
        Node c=new Node(4);
        Node d=new Node(5);
        Node e=new Node(6);
        Node f=new Node(7);
        Node g=new Node(8);
        root.left=a;
        root.right=b;
        a.left=c;
        a.right=d;
        b.left=e;
        b.right=f;
        f.left=g;
        display(root);
        System.out.println("\nSize : "+size(root));
        System.out.println("\nSum : "+sum(root));
        System.out.println("\nMax : "+max(root));
        System.out.println("\nHeight : "+height(root));
        System.out.print("\nPreorder : ");
        preorder(root);
        System.out.print("\n\nInorder : ");
        inorder(root);
        System.out.print("\n\nPostorder : ");
        postorder(root);
        System.out.print("\n\nnth Level : ");
        nthLevel(root,3);
        System.out.print("\n\nLevel Order (BFS) : ");
        bfs(root);
    }
}
