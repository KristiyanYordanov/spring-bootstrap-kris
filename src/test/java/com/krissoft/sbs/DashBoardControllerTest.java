package com.krissoft.sbs;

import static org.junit.Assert.assertEquals;

import java.util.Locale;

import org.junit.Test;

public class DashBoardControllerTest {

	@Test
	public void testHomePage() {
		DashBoardController controller = new DashBoardController();
		Locale locale = Locale.UK;
		assertEquals("home", controller.about(locale));
	}
}
