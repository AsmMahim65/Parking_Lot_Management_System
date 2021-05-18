package tester;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Controller.DateTime;

public class DateTimeTest {
	DateTime d;
	@Before
	public void setUp() throws Exception {
		d = new DateTime();
		d.setSecond(5);
		d.setMinute(10);
		d.setHour(12);
		d.setYear(2021);
		d.setMonth(3);
		d.setDay(17);
	}

	@Test
	public void testgetSecond() {
		assertEquals(5,d.getSecond());
	}
	
	@Test
	public void testgetMinute() {
		assertEquals(10,d.getMinute());
	}
	
	@Test
	public void testgetHour() {
		assertEquals(12,d.getHour());
	}
	
	@Test
	public void testgetYear() {
		assertEquals(2021,d.getYear());
	}
	
	@Test
	public void testgetMonth() {
		assertEquals(3,d.getMonth());
	}
	
	@Test
	public void testgetDay() {
		assertEquals(17,d.getDay());
	}
	
}
