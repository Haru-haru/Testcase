package snakecamel;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import org.junit.Test;

public class SnakeCamelTest{
	
	@Test
	public void snakeからcamelに直すice_creamをIceCreamに(){
		String expected="IceCream";
		String actual=SnakeCamelUtil.snakeToCamelcase("ice_cream");
		assertThat(actual,is(expected));
	}

	@Test
	public void camelからsnakeに直すILoveYouをi_love_youに(){
		String expected="i_love_you";
		String actual=SnakeCamelUtil.camelToSnakecase("ILoveYou");
		assertThat(actual,is(expected));
	}
	
	@Test
	public void capitalize大文字にするaをAに(){
		String expected="A";
		String actual=SnakeCamelUtil.capitalize("a");
		assertThat(actual,is(expected));
		
	}
	@Test
	public void capitalize大文字にするhariboをHariboに(){
		String expected="Haribo";
		String actual=SnakeCamelUtil.capitalize("haribo");
		assertThat(actual,is(expected));
		
	}
	@Test
	public void uncapitalize小文字に直すBをbに(){
		String expected="b";
		String actual=SnakeCamelUtil.uncapitalize("B");
		assertThat(actual,is(expected));
	}
	@Test
	public void uncapitalize小文字に直すHariboをhariboに(){
		String expected="haribo";
		String actual=SnakeCamelUtil.uncapitalize("Haribo");
		assertThat(actual,is(expected));
	}
}
