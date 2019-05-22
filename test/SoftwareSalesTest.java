import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class SoftwareSalesTest {
static SoftwareSales s;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		s = new SoftwareSales();
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
	
	
	//R3 Buy 20-49 packages, get 30%
	@Test
	void testBuy20Packages() {
		// Expected result = 20% discount
		SoftwareSales s = new SoftwareSales();
		double finalPrice = s.calculatePrice(30);
		assertEquals(2079, finalPrice, 0);
	}
	
	//R4: Buy 50-99 packages, get 40% discount
	@Test
	public void testBuy50Packages() {
		double finalPrice = s.calculatePrice(40);
		assertEquals(3564, finalPrice, 0);
	}

}
