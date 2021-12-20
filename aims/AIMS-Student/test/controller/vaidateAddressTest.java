package controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ValidateAddressTest {
	private PlaceOrderController placeOrderController;
	@BeforeEach
	void setUp() throws Exception{
		placeOrderController = new PlaceOrderController();
	}
	
	@Test
	void test() {
		boolean isValid = placeOrderController.validateAddress("sn 12 b");
		assertEquals(true, isValid);
	}

}
