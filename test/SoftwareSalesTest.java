import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class SoftwareSalesTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}
	
	//R1: Buy one software package
	public void testBuyOneSoftwarePackage() {
		
	}
	
	//R2: Buy 10-19 packages, get 20%

	@Test
	void testBuy10Packages() {
		// Expected result = 20% discount
		SoftwareSales s = new SoftwareSales();
		double finalPrice = s.calculatePrice(12);
		assertEquals(950.4, finalPrice, 0);
	}

}
