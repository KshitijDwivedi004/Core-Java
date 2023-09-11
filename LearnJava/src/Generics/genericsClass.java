package Generics;

class gen<t>{
	t obj;
	
	public gen(t obj){
		this.obj=obj;
	}
	public t getObj() {
		return obj;
	}
	public void showObj() {
		System.out.println("the type of daata is "+ obj.getClass().getName());
	}
}
public class genericsClass {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gen<Integer> g = new gen<Integer>(99);
		g.showObj();
		System.out.println(g.getObj());
		

	}

}
