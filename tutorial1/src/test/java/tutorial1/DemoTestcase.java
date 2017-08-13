package tutorial1;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DemoTestcase {
	
	@Test
	public void ShouldReturnTrue(){
		DemoTest demo = new DemoTest();
		assertTrue(demo.getResult());
	}

}
