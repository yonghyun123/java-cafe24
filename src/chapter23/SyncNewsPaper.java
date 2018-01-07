package chapter23;
class NewsPaper{
	String todayNews;
	boolean isTodayNews = false;
	
	public void setTodayNews(String news){
		todayNews = news;
		isTodayNews = true;
		
		synchronized (this) {
			notify();
			notify();
			
			//notifyAll();
		}
	}
	public String getTodayNews(){
		if(isTodayNews == false){
			synchronized (this) {
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return todayNews;
	}
}

class NewsWriter extends Thread{
	NewsPaper paper;
	
	public NewsWriter(NewsPaper paper){
		this.paper = paper;
	}
	
	public void run(){
		paper.setTodayNews("It's so hot about fucking java");
	}
}

class NewsReader extends Thread{
	NewsPaper paper;
	
	public NewsReader(NewsPaper paper){
		this.paper = paper;
	}
	
	public void run(){
		System.out.println("Today's News:"+paper.getTodayNews());
	}
}
public class SyncNewsPaper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewsPaper paper = new NewsPaper();
		NewsReader reader1 = new NewsReader(paper);
		NewsReader reader2 = new NewsReader(paper);
		NewsWriter writer1 = new NewsWriter(paper);
		
		reader1.start();
		reader2.start();
		writer1.start();
		
		try {
			reader1.join();
			reader2.join();
			writer1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
