package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class student implements Comparable<student>
{
	int marks;
	int age;
	String name;
	
	public student(int marks, int age, String name) {
		super();
		this.marks = marks;
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return "student [marks=" + marks + ", age=" + age + ", name=" + name + "]"+ "\n";
	}

	public int getMarks() {
		return marks;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}
	
	public int compareTo(student a) {
		if(this.age > a.age)
			return 1;
		else return -1;
	}
	
}
class Compi implements Comparator<student>{
	public int compare(student a , student b) {
		if(a.marks < b.marks)
			return 1;   //swap
		else return -1; // no swap;
	}
	
}
public class comparable {
	public static void main(String args[]) {
		student st1 = new student(96, 20, "kshitij");
		student st2 = new student(79, 18, "Aman");
		student st3 = new student(83, 23, "Devanshu");
		
		List<student> list = new ArrayList<student>();
		list.add(st1);
		list.add(st2);
		list.add(st3);
//		Compi c = new Compi();
		
//		 comparator interface
//		Comparator<student> comp = (a,b)->{
//			if(a.marks < b.marks)
//				return 1;   //swap
//			else return -1;
//		};
		
		Collections.sort(list);
		System.out.println(list);
	}

}
