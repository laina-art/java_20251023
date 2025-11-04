package ex02;

abstract class Player { //추상클래스
	
	abstract void play(int pos);//추상메소드
    abstract void stop(); //추상클래스
    
    void func() {}
    } 

class AudioPlayer extends Player{

	@Override
	void play(int pos) {
		System.out.println("-----------AudioPlayer------------");
	}
		 //적절한 코드입력
	@Override
	void stop() {
		 //적절한 코드입력
		
	}
}
class CDPlayer extends Player {
	
	@Override
	void play(int pos) {
		System.out.println("-----------CDPlayer------------");
	}
	@Override
	void stop() {
				
	}
}
abstract class MyMyPlayer extends Player{
	
	@Override
	void play(int pos) {
	  }
		
	}
	

public class MainClass {

	public static void main(String[] args) {
		
		// 1. 추상클래스는 객체 생성 불가
//		Player p1 = new Player();
		
		Player p = new AudioPlayer();
		p.play(1);
		
		p = new CDPlayer();
		p.play(1);
		
		//p = new MyMyPlayer(); MyMyPlayer() 미완성클래스(추상클래스) 
	}
}