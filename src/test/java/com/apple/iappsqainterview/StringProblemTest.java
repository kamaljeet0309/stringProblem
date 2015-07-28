package com.apple.iappsqainterview;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class StringProblemTest {

	StringProblem stringProblem = new StringProblem();
	
	@Test
	public void removeCharUsingIteration() {
		String result = stringProblem.removeCharUsingIteration("asdasdasd", 's');
		Assert.assertEquals(result, "adadad");
		result = stringProblem.removeCharUsingIteration("dadadadadddddddd", 'd');
		Assert.assertEquals(result, "aaaa");
		result = stringProblem.removeCharUsingIteration("", 'd');
		Assert.assertEquals(result, "");
		result = stringProblem.removeCharUsingIteration(null, 'd');
		Assert.assertEquals(result, null);
		result = stringProblem.removeCharUsingIteration("abcd", 'e');
		Assert.assertEquals(result, "abcd");
		result = stringProblem.removeCharUsingIteration("bbaaabbcb", 'b');
		Assert.assertEquals(result, "aaac");
		result = stringProblem.removeCharUsingIteration("bbaaabbcb", 'c');
		Assert.assertEquals(result, "bbaaabbb");
		result = stringProblem.removeCharUsingIteration("bbaaabbcb", '\0');
		Assert.assertEquals(result, "bbaaabbcb");
		result = stringProblem.removeCharUsingIteration("bbaa8abbcb", '8');
		Assert.assertEquals(result, "bbaaabbcb");
		result = stringProblem.removeCharUsingIteration("This is a line test", 'i');
		Assert.assertEquals(result, "Ths s a lne test");
	}
	
	@Test
	public void removeCharUsingAPI() {
		String result = stringProblem.removeCharUsingAPI("asdasdasd", 's');
		Assert.assertEquals(result, "adadad");
		result = stringProblem.removeCharUsingAPI("dadadadadddddddd", 'd');
		Assert.assertEquals(result, "aaaa");
		result = stringProblem.removeCharUsingAPI("", 'd');
		Assert.assertEquals(result, "");
		result = stringProblem.removeCharUsingAPI(null, 'd');
		Assert.assertEquals(result, null);
		result = stringProblem.removeCharUsingAPI("abcd", 'e');
		Assert.assertEquals(result, "abcd");
		result = stringProblem.removeCharUsingAPI("bbaaabbcb", 'b');
		Assert.assertEquals(result, "aaac");
		result = stringProblem.removeCharUsingAPI("bbaaabbcb", 'c');
		Assert.assertEquals(result, "bbaaabbb");
		result = stringProblem.removeCharUsingAPI("bbaaabbcb", '\0');
		Assert.assertEquals(result, "bbaaabbcb");
		result = stringProblem.removeCharUsingAPI("bbaa8abbcb", '8');
		Assert.assertEquals(result, "bbaaabbcb");
		result = stringProblem.removeCharUsingAPI("This is a line test", 'i');
		Assert.assertEquals(result, "Ths s a lne test");
	}
	
}
