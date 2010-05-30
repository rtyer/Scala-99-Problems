package com.ryantyer

// Find the last element of a list in scala
object P01 {
	
	// The obvious solution of using a built in
	def lastBuiltins(numbers:List[Any]):Any=numbers.last
	
	// This is a simple recursive solution of splitting on head/tail until you have one element left.
	def lastFunctional(members:List[Any]):Any={
		if(members.size==1){
			return members.head
		}
		lastFunctional(members.tail)
	}
	
	// My description of solution and why it works:
	/*
	This solution uses pattern matching to handle recurse in basically the same way as my functional 
	solution, albeit in a more readable way once you get how this works.
	
	First thing to know is what :: is.  It's the 'cons' operator.  It basically appends an element to 
	the head of a list.  As such, the first case is where we have just an element and Nil for the rest 
	of the list.  In this case, we simply return that head element.  
	
	In the second case, we have a head and some unknown number of elements on the right hand side.  We then
	recursively pass that tail portion, discaring the head element.
	
	Finally, the fall back case.  If the first two cases didn't match, we have a state where there is no element 
	at the 'last' position.  
	
	Some things to learn/observe in this code:  
	
	* When you name a part of the pattern, you're also getting a hook on it's value, so that you can then 
	pass that value around on the right hand side of the case.  
	
	* _ is a generic place holder for when you don't need a handle on that part of the pattern.
	
	* h and tail are not special terms here, simply what I'm using for ease of use. 
	
	* [A] after the method name but before the arguements is the means of generifying the method
	
	* Case really matters on Nil.  nil is not a reserved word and the code will barf if you use it 
	(scala thinks you're matching a head element with some tail element with a named hook of nil)
	
	*/
	def answer[A](members:List[A]):A=members match {
		case h::Nil 	=> h 
		case _::tail 	=> answer(tail)
		case _ 			=> throw new NoSuchElementException()
	}
}
