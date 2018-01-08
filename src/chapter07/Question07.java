package chapter07;

class User {
	int numOfMarble;
	
	public User(int numOfMarble){
		this.numOfMarble = numOfMarble;
	}
	
	public void play(User user, int numOfMarble){
		this.numOfMarble += numOfMarble;
		user.numOfMarble -= numOfMarble;
	}
	
	public void showResult(){
		System.out.println("number of marble:"+numOfMarble);
	}
}

public class Question07 {
	private int num;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User u1 = new User(15);
		User u2 = new User(9);
		
		// first game
		u1.play(u2, 2);
		u1.showResult();
		u2.showResult();
		
		//second game
		u2.play(u1, 7);
		u1.showResult();
		u2.showResult();
	}
	public void func(){
		this.num = 3;
	}

}
