package simpleuse.functionaldemo;

/**
 * 声明可用函数编程的接口  这个接口里面的抽象方法只能有一个 默认方法可以有多个
 * @author GeL
 *
 */
@FunctionalInterface
public interface PeopleService {
	People getPeople(int id);

	default void defaultMethod1(){
		System.out.println("我是默认方法1");
	}
	
	default void defaultMethod2(){
		System.out.println("我是默认方法2");
	}
}
