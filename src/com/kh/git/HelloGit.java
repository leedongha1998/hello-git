package com.kh.git;

import com.kh.git.animal.Cat;
import com.kh.git.animal.Dog;
import com.kh.git.animal.Snake;

public class HelloGit {
	public static void main(String[] args) {
		System.out.println("안녕하세요!!!!!");
		System.out.println("HelloGit!!!");
		
//		Dog 기능 추가
		Dog dog = new Dog();
		dog.bark();
		
//		Cat 기능 추가
		Cat cat = new Cat();
		cat.miao();
		
//		Snake 기능 추가
		Snake snake = new Snake();
		snake.move();
	}
}
