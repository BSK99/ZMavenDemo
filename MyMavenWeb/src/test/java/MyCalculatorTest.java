import static org.junit.Assert.*;

import org.junit.Test;

import com.MyMavenWeb.MyCalculator;

public class MyCalculatorTest {

	@Test
	public void test1() {
	MyCalculator mc=new MyCalculator();
		assertEquals(10,mc.add(5,5));
	}
	@Test
	public void test2() {
	MyCalculator mc=new MyCalculator();
		assertEquals(5,mc.add(2,3));
	}
	@Test
	public void test3() {
	MyCalculator mc=new MyCalculator();
		assertEquals(10,mc.prod(2,5));
	}
}
