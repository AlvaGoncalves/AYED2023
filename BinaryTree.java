package practica2;

import java.util.Scanner;

public class BinaryTree <T> {
	
	private T data;
	private BinaryTree<T> leftChild;   
	private BinaryTree<T> rightChild; 

	
	public BinaryTree() {
		super();
	}

	public BinaryTree(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	/**
	 * Preguntar antes de invocar si hasLeftChild()
	 * @return
	 */
	public BinaryTree<T> getLeftChild() {
		return leftChild;
	}
	/**
	 * Preguntar antes de invocar si hasRightChild()
	 * @return
	 */
	public BinaryTree<T> getRightChild() {
		return this.rightChild;
	}

	public void addLeftChild(BinaryTree<T> child) {
		this.leftChild = child;
	}

	public void addRightChild(BinaryTree<T> child) {
		this.rightChild = child;
	}

	public void removeLeftChild() {
		this.leftChild = null;
	}

	public void removeRightChild() {
		this.rightChild = null;
	}

	public boolean isEmpty(){
		return (this.isLeaf() && this.getData() == null);
	}

	public boolean isLeaf() {
		return (!this.hasLeftChild() && !this.hasRightChild());

	}
		
	public boolean hasLeftChild() {
		return this.leftChild!=null;
	}

	public boolean hasRightChild() {
		return this.rightChild!=null;
	}
	@Override
	public String toString() {
		return this.getData().toString();
	}

	public int contarHojas() {
		int cont = 0;
		if(!this.isLeaf()) {
			if(this.hasLeftChild()) 
				cont += this.getLeftChild().contarHojas();
			if(this.hasRightChild()) 
				cont += this.getRightChild().contarHojas();
		}else {
			cont++;
			System.out.println(cont);
		}
			return cont;
	}
		
		
    	 
    public BinaryTree<T> espejo(){
		       		  
 	   return null;
    }

	// 0<=n<=m
	public void entreNiveles(int n, int m){
		
   }
	
	public static void main(String[] args) {
		BinaryTree<Integer> B = new BinaryTree<Integer>(1);
		BinaryTree<Integer> B2 = new BinaryTree<Integer>(2);
		BinaryTree<Integer> B3 = new BinaryTree<Integer>(3);
		BinaryTree<Integer> B4 = new BinaryTree<Integer>(4);
		
		B.addLeftChild(B2);
		B.addRightChild(B3);
		B2.addLeftChild(B4);
		
		B.contarHojas();
		
	/*	
								    (1)
								  /	    \
								(2)     (3)
							   /   \	 /
							 (4)    (5) (6)
								 		
	*/	
	
		
		System.out.println("¡Bienvenido al sistema de impresion de arboles binarios! ");
		System.out.println("...");
		System.out.println("Imprimiento Arbol Binario");
		System.out.println("Procesando...");
		
		
		System.out.println("...");
		System.out.println("Fin del programa");
		
		
	}
	
}

