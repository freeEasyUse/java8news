package simple.use.j8demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainClient {

	public static void main(String[] args) {
		Formula formula = new FormulaImple();
		System.out.println(formula.calculate(10));
		/**
		 * ʹ�ýӿ��еķ���
		 */
		System.out.println(formula.squet(4));
	
		/**
		 * Lambda ���ʽ �ܹ�ʵ�ְ������������Ķ���
		 */
		List<String> list = Arrays.asList("c","d","a","y","m","t");
		System.out.println(list);
		Collections.sort(list,(String a,String b) -> { return b.compareTo(a);});
		System.out.println(list);
	
	}
	
}
