package tester;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Model.Car;

public class CarTest {
	Car c;
	@Before
	public void setUp() throws Exception {
		c = new Car();
		c.setNumDoors(5);
		c.setCarColor(6);
	}

	@Test
	public void testgetSecond() {
		assertEquals(5,c.getNumDoors());
	}
	
	@Test
	public void testgetCarColor() {
		assertEquals(6,c.getNumDoors());
	}

}
