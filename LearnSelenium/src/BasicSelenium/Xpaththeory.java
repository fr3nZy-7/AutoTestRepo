package BasicSelenium;

public class Xpaththeory {
	
	
	
	
	/*
	 * 
	 * if we are getting multiple elements for an xpath -
	 * --flipkart example
	 * 
	 *    //a[text()='Shirts'] -> is giveing 1 of 4 as count
	 *    
	 *    then we can add the entire xpath in paranthesis ( ) and give an occurance
	 *    
	 *    (//a[text()='Shirts'])[2] -> to select element at no 2 - here 2 is called occurance and not index
	 *    
	 *    
	 *    
	 *    Types of xpath relationship
	 *    
	 *    1. Parent - Child
	 *    2. Preceding - following
	 *    3. Preceding sibling - following sibling
	 *    4. Ancestors - descendants
	 *    
	 *    (all these are keywords which we can use to target a web element, alos known as xpath axes) 
	 *    
	 *    
	 *    
	 *    
	 *    
	 *    Examples of Following and Preceding --->
	 *    
	 *    //span[text()='Men']//following::a[text()='Shirts']
	 *    
	 *    //span[text()='Men']//following::a[text()='Top wear']//following::a[text()='Shirts']
	 *    
	 *    //a[text()='Suits & Blazers']//preceding::a[text()='Shirts']
	 *    
	 *    
	 *    here target element is Shirts in above 3 examples
	 *    
	 *    and referenece are Men, Men and top wear, and suits and blazer
	 *    
	 *    reference element comes first then comes the target element
	 *    
	 *    //span[text()='Men']//following::a[text()='Suits & Blazers']//preceding::a[text()='Shirts']
	 *    
	 *    can be used as this as well
	 *    
	 *    
	 *    
	 *    Example ->
	 *    
	 *    //a[text()='Suits & Blazers']//parent
	 *    and 
	 *    //a[text()='Suits & Blazers']/..   (can also use //.., will show all parents)
	 *    
	 *    both these will take you to the immediate parent 
	 *    
	 *    
	 *    
	 *    Example of preceding sibling->
	 *    
	 *    //a[text()='Suits & Blazers']/..//preceding-sibling::li/a[text()='Shirts']
	 *    
	 *    
	 * 	Example of preceding ->
	 * 
	 * 	//a[text()='Shirts']//preceding::span[text()='Men']
	 * 
	 * here Men is target and Shirts is reference
	 * 	
	 * 
	 * 	example of following sibling ->
	 * 
	 * 	//a[text()='Top wear']/..//following-sibling::li/a[text()='Shirts']
	 * 
	 * 	top wear is reference and Shirts is target
	 * 
	 * here using top wear we go to its parent using /.. then go to its parents's sibling using the axes
	 * then using li (the sibling of top wear's parent) we go to a by using li/a[.....]
	 * 
	 * 	
	 * 	Example of ancestor ->
	 * 
	 * 	//a[text()='Shirts']//ancestor::li/span[text()='Men']
	 * 
	 * similar to above exaple using shirts and using ancestor keyword we go the very first tag which is html.. 
	 * then go to li/span[men].. since li is one of the ancestor of shirts 
	 * 
	 * 
	 * 	Example of descendant ->
	 * 
	 * //span[text()='Men']/../descendant::a[text()='Shirts']
	 * 		here using Men as reference 
	 *  using /.. we go to the parent of Men which is html tag
	 *  and then form html tag using the descendant keyword we go to Shirts
	 *  
	 *  
	 *  
	 *  tricentis request a demo example ->
	 *  
	 *  //p[contains(.,'Automated Continuous Testing')]//following-sibling::div/div/a[contains(.,'Request')]
	 *  
	 *  using Automated Continuous Tesing as reference we have 2 div siblings
	 *  inside a div we have one more div and then a having request a demo
	 * 
	 * 
	 * 
	 */

}
