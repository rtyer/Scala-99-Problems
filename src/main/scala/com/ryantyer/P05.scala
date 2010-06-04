package com.ryantyer

object P05{
	def builtin[A](ls:List[A]):List[A]={
		ls.reverse
	}
	
	def reverse[A](ls:List[A]):List[A]=ls match{
		case Nil => Nil
		case Nil::t => t
		case h::tail => reverse(tail):::List(h)
	}
	/*
	This solution uses the built in command foldLeft to create a reversed list.  How it works is this:
	
	Fold left is a method that takes a curry'd param of the initial value.  In this case, we use 
	List[A]()  aka, a new list generified to type A
	
	Once the function is curried, we set the paramater of a function that takes a function that takes 
	two parameters and returns them as a list.  foldLeft starts with the right most parameters and moves 
	to the left.  In this case, we simply reverse the two params with cons.  
	
	One thing that may trick you up is the use of curly braces...in scala, you can use {} instead of ()
	when you have a single parameter (in this case, the single parameter is a function).
	*/
	def fold[A](ls:List[A]):List[A]={
		ls.foldLeft(List[A]()){
			(left,right)=>right::left 
		}
	}
}