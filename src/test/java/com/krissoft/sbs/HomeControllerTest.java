package com.krissoft.sbs;

import static org.junit.Assert.assertEquals;

import java.util.Locale;

import org.junit.Test;

public class HomeControllerTest {

	@Test
	public void testHomePage() {
		HomeController controller = new HomeController();
		Locale locale = Locale.UK;
		assertEquals("home", controller.home(locale));
	}
}
