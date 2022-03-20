package technoserve.c2tc.m07;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.mockito.Mockito;
import org.junit.Test;
import org.mockito.Mockito;

public class CalculatorTest {
	CalculatorService cs = Mockito.mock(CalculatorService.class);
	Calculator c = new Calculator(cs);

	@Test
	public void test() {
		when(cs.sum(2, 3)).thenReturn(5);
		assertEquals(10, c.perform(2,3));
	}

}
