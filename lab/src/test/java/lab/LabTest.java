package lab;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

import org.junit.Test;

public class LabTest {
	Date d;
	
	public LabTest() {
		d = new Date();
	}
	@Test
	public void test_fahrenheit_to_centigrade() {
		assertEquals(37,Lab.fahrenheitToCentigrade(100));
		assertEquals(-6,Lab.fahrenheitToCentigrade(20));
		assertEquals(0,Lab.fahrenheitToCentigrade(32));
	}
	
	@Test
	public void test_centigrade_to_fahrenheit() {
		assertEquals(98,Lab.centigradeToFahrenheit(37));
		assertEquals(22,Lab.centigradeToFahrenheit(-6));
		assertEquals(32,Lab.centigradeToFahrenheit(0));
	}
	
	@Test
	public void test_removeSign_of_Exclaimation() {
		String s1 = "Hello World!";
		String s2 = "I love!: Programming";
		assertFalse(Lab.removeSignOfExclaimation(s1).contains("!"));
		assertFalse(Lab.removeSignOfExclaimation(s2).contains("!"));
	}
	
	@Test
	public void test_get_current_day() {
		LocalDate lDate = d.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		assertEquals(lDate.getDayOfMonth(),Lab.getCurrentDay());
	}
	
	@Test
	public void test_get_current_month() {
		LocalDate lDate = d.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		assertEquals(lDate.getMonthValue(),Lab.getCurrentMonth());
	}
	
	@Test
	public void test_get_current_year() {
		LocalDate lDate = d.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		assertEquals(lDate.getYear(),Lab.getCurrentYear());
		
	}
	
}
