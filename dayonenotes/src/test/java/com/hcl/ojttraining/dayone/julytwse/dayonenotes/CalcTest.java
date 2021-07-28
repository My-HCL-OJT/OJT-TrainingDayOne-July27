package com.hcl.ojttraining.dayone.julytwse.dayonenotes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.hcl.ojttraining_dayone_julytwse.dayonetopic.calc.BasicCalculator;
import com.hcl.ojttraining_dayone_julytwse.dayonetopic.calc.ScientificCalculator;

public class CalcTest {
	BasicCalculator bCalc = new BasicCalculator();
	ScientificCalculator sCalc = new ScientificCalculator();

	@Test
	public void testAddBC() {
		assertEquals(bCalc.add(5.00, 5.00), 10.0000, 0);
	}

	@Test
	public void testSubBC() {
		assertEquals(bCalc.subtract(5.00, 5.00), 0.0, 0);
	}

	@Test
	public void testMulBC() {
		assertEquals(bCalc.multiply(5.00, 5.00), 25.0000, 0);

	}

	@Test
	public void testDivBC() {
		assertEquals(bCalc.divide(5.00, 5.00), 1.0000, 0);
	}

	@Test
	public void testAddSC() {
		assertEquals(sCalc.add(5.00, 5.00), 10.0000, 0);
	}

	@Test
	public void testSubSC() {
		assertEquals(sCalc.subtract(5.00, 5.00), 0.0, 0);
	}

	@Test
	public void testMulSC() {
		assertEquals(sCalc.multiply(5.00, 5.00), 25.0000, 0);
	}

	@Test
	public void testDivSC() {
		assertEquals(sCalc.divide(5.00, 5.00), 1.0000, 0);
	}
	@Test
	public void testPowSC() {
		assertEquals(sCalc.pow(5.00, 2.00), 25.0, 0);
	}
}
