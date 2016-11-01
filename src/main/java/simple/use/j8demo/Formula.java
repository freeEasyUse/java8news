package simple.use.j8demo;
public interface Formula {

	double calculate(int a);
	
	/**
	 * 新特性 在接口中定义方法
	 * @param a
	 * @return
	 */
	default double squet(int a){
		return a*a;
	}
}
