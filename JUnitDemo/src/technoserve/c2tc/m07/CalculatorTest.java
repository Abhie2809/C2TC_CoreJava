package technoserve.c2tc.m07;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

class CalculatorTest {
	Calculator c;
	
	@BeforeEach
	void setup() {
		System.out.println("This is Setup");
		c = new Calculator();
	}
	
	@BeforeAll
	static void setup1() {
		System.out.println("demo");
	}
	
	@Test
	void test() {
		assertEquals(5, c.add(2,3));
	}
	
	@Test
	void areatest() {
		assertEquals(Math.PI, c.area(1));
	}
	
	private static String[] method() {
		return new String [] {"Abhijeet","Anil","Jagdale"};
	}
	
	@ParameterizedTest
	@MethodSource("method")
	void test1(String args) {
		System.out.println(args);
	}
	
	@RepeatedTest(value=4)
	void test2() {
		System.out.println("This is Repeated Test");
	}

}
