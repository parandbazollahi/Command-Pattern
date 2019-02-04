package week3;

import static org.junit.Assert.*;

public class Test {

	@org.junit.Test
	public void test() {
		ClientOrder NewOrder = Baker.GetOrder();
		ChoclateCake choclate = new ChoclateCake(NewOrder);
		PlaceOrder place = new PlaceOrder(choclate);
		boolean result = place.GiveTheOrderToBaker();
		assertTrue(result);
	}

}
