package Seminar1.sample;

import Seminar1.regular.OtherClass;

/**
* Базовый класс нашего декоратора
* и способы взаимодействия с ним.
*/

public class Main{
	/**
	* Точка входа Мейн
	* */
	public static void main(String[] args){
		System.out.println("Hellow world");
		int result = OtherClass.sum(2, 2);
		System.out.println(OtherClass.decorate(result));
	}
}