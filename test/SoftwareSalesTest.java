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

	@Test
	void testBuyOneSoftwarePackage() {
		SoftwareSales s = new SoftwareSales();
		double finalPrice = s.calculatePrice(1);
		assertEquals(99, finalPrice, 0);
	}

}
