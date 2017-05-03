package br.edu.bribeiro;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AddressTest {

	@Test
	public void streetNameAndNumber() {
		Address address = new Address("Winterallee 3");

		String streetName = address.convert().get(0);
		String streetNumber = address.convert().get(1);

		assertEquals("Winterallee", streetName);
		assertEquals("3", streetNumber);
	}

	@Test
	public void streetNameAndNumber2() {
		Address address = new Address("Musterstrasse 45");

		String streetName = address.convert().get(0);
		String streetNumber = address.convert().get(1);

		assertEquals("Musterstrasse", streetName);
		assertEquals("45", streetNumber);
	}

	@Test
	public void streetNameAndNumberWithComplement() {
		Address address = new Address("Blaufeldweg 123B");

		String streetName = address.convert().get(0);
		String streetNumber = address.convert().get(1);

		assertEquals("Blaufeldweg", streetName);
		assertEquals("123B", streetNumber);
	}

	@Test
	public void streetLongNameAndNumber() {
		Address address = new Address("Am Bächle 23");

		String streetName = address.convert().get(0);
		String streetNumber = address.convert().get(1);

		assertEquals("Am Bächle", streetName);
		assertEquals("23", streetNumber);
	}

	@Test
	public void streetNumberCommaAndLongName() {
		Address address = new Address("4, rue de la revolution");

		String streetName = address.convert().get(0);
		String streetNumber = address.convert().get(1);

		assertEquals("rue de la revolution", streetName);
		assertEquals("4", streetNumber);
	}

	@Test
	public void streetNumberAndLongName() {
		Address address = new Address("200 Broadway Av");

		String streetName = address.convert().get(0);
		String streetNumber = address.convert().get(1);

		assertEquals("Broadway Av", streetName);
		assertEquals("200", streetNumber);
	}

	@Test
	public void streetLongNameCommaAndNumber() {
		Address address = new Address("Calle Aduana, 29");

		String streetName = address.convert().get(0);
		String streetNumber = address.convert().get(1);

		assertEquals("Calle Aduana", streetName);
		assertEquals("29", streetNumber);
	}

	@Test
	public void streetLongNameWithNumberAndNumberWithNo() {
		Address address = new Address("Calle 39 No 1540");

		String streetName = address.convert().get(0);
		String streetNumber = address.convert().get(1);

		assertEquals("Calle 39", streetName);
		assertEquals("No 1540", streetNumber);
	}
}
