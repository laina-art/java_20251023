package 연습문제2;

import java.security.PublicKey;

public class Main {
	
    public static void main(String[] args) {
    	
    	Animal dog = new Dog("초코", 3);
    	dog.showInfo();
    	dog.makeSound();
    	
    	Animal cat = new Cat("로이",2);
    	cat.showInfo();
    	cat.makeSound();
    	
    	Animal t = new Animal("동물",10);
       	t.makeSound();
    	

    	
    }    
}

