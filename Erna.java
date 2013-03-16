import static org.junit.Assert.*;

import org.junit.Test;

public class Erna {

	@Test
	public void test1ProduceHugo() {
		assertEquals("hugo", Hugo.produceHugo(1));
	}

	@Test
	public void test2ProduceHugo() {
		assertEquals("erna", Hugo.produceHugo(2));
	}

}

