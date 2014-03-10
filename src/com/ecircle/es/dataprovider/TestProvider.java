package com.ecircle.es.dataprovider;

import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;

public class TestProvider {

	// @Test
	// public void test() {
	// fail("Not yet implemented");
	// }

	RandomTextEngine rte = new RandomTextEngine();

	@Test
	public void testNextWords() throws Exception {
		Collection<String> nextWords = rte.nextWords(5);
		Assert.assertNotNull(nextWords);
		Assert.assertEquals(5, nextWords.size());

	}

	@Test
	public void testNextphrase() throws Exception {
		Collection<String> nextphrase = rte.nextPhrases(6);
		Assert.assertNotNull(nextphrase);
		Assert.assertEquals(6, nextphrase.size());

	}

}
