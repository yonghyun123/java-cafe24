package chapter24;
enum City{
	SEOUL(200), BUSAN(100), JEJU(50);
	int populatation;
	City(int popu){
		this.populatation = popu;
	}
	public int getPopulation(){
		return populatation;
	}
}
public class EnumInstMember {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(City.SEOUL.getPopulation());
		System.out.println(City.BUSAN.getPopulation());
		System.out.println(City.JEJU.getPopulation());
	}

}
