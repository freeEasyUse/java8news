package simple.use.j8demo;
public interface Formula {

	double calculate(int a);
	
	/**
	 * ������ �ڽӿ��ж��巽��
	 * @param a
	 * @return
	 */
	default double squet(int a){
		return a*a;
	}
}
