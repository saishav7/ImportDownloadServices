package au.edu.unsw.sltf.services.test;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.List;

import org.junit.Test;

import au.edu.unsw.sltf.services.helper.MarketData;

public class FileReaderTest {

	@Test
	public void test() throws FileNotFoundException, ParseException {
		MarketData m = new MarketData("12345");
		List<MarketData> md = m.getMd();
		MarketData market = md.get(0);
		assertEquals(market.getSec(), "ZXQ");
	}

}
