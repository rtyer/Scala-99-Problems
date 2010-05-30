package com.ryantyer

object P02 {
	def imperativeSecondToLast[A](items:List[A]):A={
		items(items.size-2)
	}
	
	def functionalSecondToLast[A](items:List[A]):A={
		if(items.size==2) return items.head
		functionalSecondToLast(items.tail)
	}
	
	def functionalMatchingSecondToLast[A](items:List[A]):A=items match {
		case h::_::Nil 	=> h
		case _::tail 	=> functionalMatchingSecondToLast(tail)
		case _			=> throw new NoSuchElementException();
	}
}