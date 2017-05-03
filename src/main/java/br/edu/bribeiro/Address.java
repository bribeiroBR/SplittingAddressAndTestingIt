package br.edu.bribeiro;

import java.util.ArrayList;

public class Address {

	private String fullAddress;

	public Address(String fullAddress) {
		this.fullAddress = fullAddress;
	}

	// this method split the input address in Street Name and Number
	public ArrayList<String> convert() {

		String tempInput = "Something went wrong";
		ArrayList<String> outputAddress = new ArrayList<String>();

		tempInput = fullAddress.replaceAll("[,.]", "");

		if (fullAddress.matches(".*\\bNo\\b.*")) {
			outputAddress.add(0, tempInput.replaceAll("No.*", " ").trim());
			outputAddress.add(1, tempInput.replaceAll(".*No", "No").trim());
		} else {
			outputAddress.add(0, tempInput.replaceAll("[0-9]\\w*+", " ").trim());
			outputAddress.add(1, tempInput.replaceAll("[^0-9]\\w*.s*+", " ").trim());
		}

		return outputAddress;
	}

}
