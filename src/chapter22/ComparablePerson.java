package chapter22;

import java.util.TreeSet;

class Person implements Comparable<Person>{
	String name;
	int age;
	
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public void showData(){
		System.out.printf("%s %d\n",name,age);
	}

	public int compareTo(Person p) {
		if(age>p.age) return 1;
		else if(age<p.age) return -1;
		else return 0;

	}
	
}
public class ComparablePerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		인스턴스 비교기준을 정할 땐 그 클래스에 Comparable interface를 구현해야해
//		그래야 TreeSet 자동정렬이가능
		TreeSet<Person> sTree = new TreeSet<>();
		sTree.add(new Person("Kim",24));
		sTree.add(new Person("lee",21));
		sTree.add(new Person("han",29));
		
		/*
		 * 중요
		 * 인자로 전달된 obj의 나이가 더 작다면 1을 반환
		 * 인자로 전달된 obj의 나이가 더 크다면 -1을 반환
		 * 같다면 0을 반환
		 * 
		 */
		
		for(Person item : sTree){
			item.showData();
		}
	}

}
