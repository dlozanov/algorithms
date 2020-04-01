package dynamicData;

import data.Data;
import data.Data2;
import data.Data3;

public class BinaryTree {
	Data3 root = null;
	
	public void add( int key, String data, Data3 tree ) {
		Data3 d = new Data3(key, data);
		if( root == null ) {
			root = d;
		}
		else {
			if( tree != null ) {
				if( key < tree.key ) {
					if( tree.left != null )
						add( key, data, tree.left );
					else {
						tree.left = d;
						d.parent = tree;
					}
				}
				else {
					if( tree.right != null )
						add( key, data, tree.right );
					else {
						tree.right = d;
						d.parent = tree;
					}
				}
			}
			else {
				Data3 p = root;
				add( d, p );
			}
		}
	}
	
	public void add( Data3 data, Data3 tree ) {
		if( root == null ) {
			root = data;
		}
		else {
			if( tree != null ) {
				if( data.key < tree.key ) {
					if( tree.left != null )
						add( data, tree.left );
					else {
						tree.left = data;
						data.parent = tree;
					}
				}
				else {
					if( tree.right != null )
						add( data, tree.right );
					else {
						tree.right = data;
						data.parent = tree;
					}
				}
			}
			else {
				Data3 p = root;
				add( data, p );
			}
		}
	}
	
	public Data3 get( int key ) {
		Data3 p = root;
		while( p != null ) {
			if( key < p.key ) {
				p = p.left;
			}
			else if ( key > p.key ) {
				p = p.right;
			}
			else {
				return p;
			}
		}
		return null;
	}
	
	public Data3 findMin( Data3 tree ) {
		while( tree.left != null )
			tree = tree.left;
		return tree;
	}
	
	public Data3 getParent( int key, Data3 tree ) {
		if( tree == null )
			tree = root;
		if( key < tree.key ) {
			if( tree.left != null ) {
				if( tree.left.key == key )
					return tree;
				else
					tree = tree.left;
			}
		} 
		else {
			if( tree.right != null ) {
				if( tree.right.key == key )
					return tree;
				else
					tree = tree.right;
			}
		}
		return null;
	}
	
	public Data3 delete( int key, Data3 tree ) {
		if( tree == null )
			tree = root;
		if( key < tree.key ) {
			if( tree.left != null )
				delete( key, tree.left );
		}
		else if( key > tree.key ) {
			if( tree.right != null )
				delete( key, tree.right );
		}
		else {
			if( tree.left != null && tree.right != null ) {
				Data3 temp = findMin(tree.right);
				tree.key = temp.key;
				tree.data = temp.data;
				tree.dateTime = temp.dateTime;
				delete(tree.key, tree.right);
			}
			else {
				if( tree.left != null ) {
					if( tree.left.key < tree.parent.key )
						tree.parent.left = tree.left;
					else
						tree.parent.right = tree.left;
//					tree = tree.left;
				}
				else if( tree.right != null ) {
					if( tree.right.key < tree.parent.key )
						tree.parent.left = tree.right;
					else
						tree.parent.right = tree.right;
//					tree = tree.right;
				}
				else
					if( key < tree.parent.key )
						tree.parent.left = null;
					else
						tree.parent.right = null;
			}
			return tree;
		}
		return null;
	}
	
	public void print() {
		Data3 p = root;
		printElem(p);
	}
	
	public void printElem( Data3 p ) {
		if( p!= null ) {
			printElem(p.left);
			System.out.println( p.key + " " + p.data + " " + p.dateTime.toString() );
			printElem(p.right);
		}
	}
}
