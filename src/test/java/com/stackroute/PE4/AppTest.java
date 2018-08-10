package com.stackroute.PE4;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class AppTest{
    private static App app;
    
    @BeforeClass
    public static void setup() {
    	app = new App();
    }
    
    @AfterClass
    public static void terdown() {
    	app = null;
    }
    
    @Test
    public void test1() {
	    assertEquals("abababaaaabababa",app.longString("aabbccabababaaaabababacbabccbcbcb"));
	    assertEquals("bqq",app.longString("wabqqabrabeabeabr"));
	    assertNotEquals("abafdsasdfr",app.longString("abadadaaba"));
    }
    
    @Test
    public void test2(){
    	assertEquals(5, app.occur("sunshinesunsunset", "s"));
    	assertNotEquals(8, app.occur("sunshinesunsetsunn","n"));
    }
    
    @Test
    public void test3(){
    	assertEquals("faityfry", app.repAll("daiIydry"));
    	assertNotEquals("fairygirl", app.repAll("daiIygo"));
    }
    
    @Test
    public void test4() {
    	assertEquals(new String("aaghhiikmnrsssu"), app.paraSort(new String("Sashi Kumar Singh")));
    	assertNotNull( app.paraSort(new String("Sashi Kumar Singh")));
    	assertNotEquals(new String("Sashi Kumar Singh"),  app.paraSort(new String("Sashi Kumar Singh")));
    }
    
	@Test
    public void test5() {
    	assertArrayEquals(new String[] {"a", "kciuq", "nworb", "xof", "spmuj", "revo", "eht", "yzal", "god"},
    			app.transpose(new String[] {"a", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"}));
    	assertNotNull(app.transpose(new String[] {"a", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"}));
    	assertNotEquals(new String[] {"a", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"},
    			app.transpose(new String[] {"a", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"}));
    }
    
	@Test
	public void test6() {
		assertEquals(new String("true"), app.regExp(new String("This is Harry")));
		assertEquals(new String("false"), app.regExp(new String("This is Henry")));
		assertNotNull(app.regExp(new String("This is Henry")));
	}

	@Test
	public void test7() {
		assertEquals(new String("4-6 10-12 27-29"), app.matcher(new String("She sells seashells by the seashore"),
					new String("se")));
		assertNotNull(app.matcher(new String("She sells seashells by the seashore"),new String("se")));
		assertNotEquals(new String("4-6 10-12 27-28"), app.matcher(new String("She sells seashells by the seashore"),
				new String("se")));
	}
	
}
