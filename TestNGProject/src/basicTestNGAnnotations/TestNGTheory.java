package basicTestNGAnnotations;

public class TestNGTheory {
	
	
	/*
	 * 
	 * Test NG is a framework which categorizes multiple test cases into layers using its annotations
	 * 
	 *  after its execution we get one html report
	 *  
	 *  main function logic is also written inside test NG
	 *  
	 *  
	 *  
	 *  by default test execution happens in alphabetical order
	 *  
	 *  
	 *  using priority keyword we can give the order of execution
	 *  
	 *  @Test(priority= number) is the syntax
	 *  
	 *  by default priority is 0 for all tests, we when priority is not explicitly set
	 *  
	 *  if multiple test have priority as zero then they will be run in alphabetical order then priority 1 test will run
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  depends on methods is used to logically give a sequence of execution
	 *  
	 *  say test login, verify home page and logout are tests that need to be executed in the said sequence
	 *  
	 *  if we dont give priority it will run in alphabetical order
	 *  
	 *  we give depends on becuase if login fails then there is no point in running vreify home page and logout
	 *  
	 *  so depends on method will skip the methos that are depending on the failed method
	 *  thats why depends on method is used to give a logical sequence and to save time
	 *  
	 *  syntax is as follows -
	 *  (dependsOnMethods = {"name of the method to test"})
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  List of TestNG annotations for execution -
	 *  @BeforeSuite - runs at the very beginning, before initializing and running the testSuite - example - Verify environment setup, initialization of any reporting tools - depends on project to project - it should contain what a tester needs to check/test/verify before starting the tests
	 *  @BeforeTest - runs at the beginning of each test, not to be confused with @Test annotation, it is a logical test
	 *  @BeforeClass - runs at the beginning of each class created for our tests
	 *  @BeforeMethod - runs at the beginning of each method, that is each @Test annotation
	 *  @Test	 - runs the method where @Test annotation is given, this is one test at granular level
	 *  @AfterMethod - opposite of its before counterpart
	 *  @AfterClass -  ""
	 *  @AfterTest -   ""
	 *  @AfterSuite  - ""
	 *  
	 *  
	 *  @Beforetest an @aftertest is optional, our test classes extend the class containing @before and after test
	 *  

 Suite runs only once, test can run multiple times.. in our suite and test init tear down suite runs once test inti will run multiple times
 our test classes will extend the test init. this step is optional, if we dont create the test init and dont extend it will still run if we add it in test ng . xml file
	 *  
	 * 
	 */

}
