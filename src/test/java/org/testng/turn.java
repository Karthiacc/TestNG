package org.testng;

import org.testng.annotations.Test;

public class turn extends Baseclass {
	@Test
	private void fb() {
		getdriver();
		loadurl("https://www.facebook.com/");
	}

	@Test
	private void flipkart() {
	getdriver();
	loadurl("https://www.flipkart.com/");
	}

	@Test
	private void insta() {
	getdriver();
	loadurl("https://www.instagram.com/");
	}

}
