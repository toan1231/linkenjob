package interview;

public interface BinaryTree {
public String string(String a);
}
class Node{
	
	public static void main(String[] agrs) {
		
		
		BinaryTree tree=(String m)->{
			
			int a=3;
			String name="john";
			String n=name+"is"+String.valueOf(a)+m;
			return n;
			
		};
		System.out.println(tree.string("years old"));
		
	
	}
	
	
}