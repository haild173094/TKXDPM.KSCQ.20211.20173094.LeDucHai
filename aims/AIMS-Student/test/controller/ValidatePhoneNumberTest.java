package controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ValidatePhoneNumberTest {

	private PlaceOrderController placeOrderController;
	
	@BeforeEach
	void setUp() throws Exception{
		placeOrderController = new PlaceOrderController();
	}
	
	@Test
	void test() {
		boolean isValid = placeOrderController.validatePhoneNumber("0123456789");
		assertEquals(true,isValid);
	}

}
