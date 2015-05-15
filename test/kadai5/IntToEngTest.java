package kadai5;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;

public class IntToEngTest {

	@Test
	public void test1() {
		IntToEng ite = new IntToEng();
		String expected = "one";
		String actual = ite.translateEng(1);
		assertThat(actual,is(expected));
		
	}
	@Test
	public void test2() {
		IntToEng ite = new IntToEng();
		String expected = "two";
		String actual = ite.translateEng(2);
		assertThat(actual,is(expected));
		
	}
	@Test
	public void test3() {
		IntToEng ite = new IntToEng();
		String expected = "three";
		String actual = ite.translateEng(3);
		assertThat(actual,is(expected));
		
	}
	@Test
	public void test4() {
		IntToEng ite = new IntToEng();
		String expected = "four";
		String actual = ite.translateEng(4);
		assertThat(actual,is(expected));
		
	}
	@Test
	public void test5() {
		IntToEng ite = new IntToEng();
		String expected = "five";
		String actual = ite.translateEng(5);
		assertThat(actual,is(expected));
		
	}
	@Test
	public void test6() {
		IntToEng ite = new IntToEng();
		String expected = "six";
		String actual = ite.translateEng(6);
		assertThat(actual,is(expected));
		
	}
	@Test
	public void test7() {
		IntToEng ite = new IntToEng();
		String expected = "seven";
		String actual = ite.translateEng(7);
		assertThat(actual,is(expected));
		
	}
	@Test
	public void test8() {
		IntToEng ite = new IntToEng();
		String expected = "eight";
		String actual = ite.translateEng(8);
		assertThat(actual,is(expected));
		
	}
	@Test
	public void test9() {
		IntToEng ite = new IntToEng();
		String expected = "nine";
		String actual = ite.translateEng(9);
		assertThat(actual,is(expected));
		
	}
	@Test
	public void test11(){
		IntToEng ite=new IntToEng();
		String expected = "eleven";
		String actual = ite.translateEng(11);
		assertThat(actual,is(expected));
	}
	@Test
	public void test19() {
		IntToEng ite = new IntToEng();
		String expected = "nineteen";
		String actual = ite.translateEng(19);
		assertThat(actual,is(expected));
		
	}
	@Test
	public void test20() {
		IntToEng ite = new IntToEng();
		String expected = "twenty";
		String actual = ite.translateEng(20);
		assertThat(actual,is(expected));
		
	}
	@Test
	public void test99() {
		IntToEng ite = new IntToEng();
		String expected = "ninety nine";
		String actual = ite.translateEng(99);
		assertThat(actual,is(expected));
		
	}
	@Test
	public void test100() {
		IntToEng ite = new IntToEng();
		String expected = "one hundred";
		String actual = ite.translateEng(100);
		assertThat(actual,is(expected));
		
	}
	@Test
	public void test153() {
		IntToEng ite = new IntToEng();
		String expected = "one hundred fifty three";
		String actual = ite.translateEng(153);
		assertThat(actual,is(expected));
		
	}
	@Test
	public void test101() {
		IntToEng ite = new IntToEng();
		String expected = "one hundred one";
		String actual = ite.translateEng(101);
		assertThat(actual,is(expected));
		
	}@Test
	public void test110() {
		IntToEng ite = new IntToEng();
		String expected = "one hundred ten";
		String actual = ite.translateEng(110);
		assertThat(actual,is(expected));
		
	}@Test
	public void test2000() {
		IntToEng ite = new IntToEng();
		String expected = "two thousand";
		String actual = ite.translateEng(2000);
		assertThat(actual,is(expected));
		
	}@Test
	public void test1200() {
		IntToEng ite = new IntToEng();
		String expected = "twelve hundred";
		String actual = ite.translateEng(1200);
		assertThat(actual,is(expected));
		
	}@Test
	public void test1010() {
		IntToEng ite = new IntToEng();
		String expected = "one thousand ten";
		String actual = ite.translateEng(1010);
		assertThat(actual,is(expected));
		
	}@Test
	public void test1981() {
		IntToEng ite = new IntToEng();
		String expected = "nineteen hundred eighty one";
		String actual = ite.translateEng(1981);
		assertThat(actual,is(expected));
		
	}@Test
	public void test10000() {
		IntToEng ite = new IntToEng();
		String expected = "ten thousand";
		String actual = ite.translateEng(10000);
		assertThat(actual,is(expected));
		
	}
}