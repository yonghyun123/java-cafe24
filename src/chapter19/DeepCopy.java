package chapter19;
class Business implements Cloneable{
	private String company;
	private String work;
	
//	public Business(String company, String work){
//		this.company = company;
//		this.work = work;
//	}
	public void getData(String company, String work){
		this.company = company;
		this.work = work;
	}
	public void showBusinessInfo(){
		System.out.println("회사:"+company);
		System.out.println("업무:"+work);
	}
	public void changeWork(String work){
		this.work = work;
	}
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}

class PersonalInfo implements Cloneable{
	private String name;
	private int age;
	private Business bness;
	
	public PersonalInfo(String name, int age, String company, String work){
		this.name = name;
		this.age = age;
		bness = new Business();
		bness.getData(company, work);
	}
	public void showPersonalInfo(){
		System.out.println("이름:"+name);
		System.out.println("나이:"+age);
		bness.showBusinessInfo();
		System.out.println();
	}
	public void changeWork(String work){
		bness.changeWork(work);
	}
	public Object clone() throws CloneNotSupportedException{
		PersonalInfo copy = (PersonalInfo)super.clone();
		copy.bness = (Business)bness.clone();
		return copy;
	}
}
public class DeepCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			PersonalInfo pInfo = new PersonalInfo("james", 22, "himedia", "encoding");
			PersonalInfo pCopy = (PersonalInfo)pInfo.clone();
			pCopy.changeWork("decoding");
			
			pInfo.showPersonalInfo();
			pCopy.showPersonalInfo();
		}
		catch(CloneNotSupportedException e){
			e.printStackTrace();
		}

	}

}
