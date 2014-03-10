package com.ecircle.es.dataprovider;

import java.util.Collection;
import java.util.Iterator;

public class clientUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RandomTextEngine rte = new RandomTextEngine();

		Collection<String> nextWords = rte.nextWords(5);
		System.out.println("Words output.....");
		for (Iterator<String> iterator1 = nextWords.iterator(); iterator1
				.hasNext();) {
			String eachword = (String) iterator1.next();
			System.out.println(eachword);

		}
		System.out.println(".....End of Words output.....");
		System.out.println(".....Phrase Output.....");

		for (int i = 0; i < 3; i++) {
			System.out.println("Phrase:" + i);
			Collection<String> nextphrase = rte.nextPhrases(3);
			System.out.println("Phrase output.....");

			for (Iterator<String> iterator2 = nextphrase.iterator(); iterator2
					.hasNext();) {
				String eachphrase = (String) iterator2.next();
				System.out.println(eachphrase);
			}
			System.out.println(".....End of Phrases [" + i + "] output.....");
		}
	}
}
