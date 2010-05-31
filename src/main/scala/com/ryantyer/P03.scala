package com.ryantyer
object P03 {
	def nth[A](pos:Int, ls:List[A]):A={
		ls(pos)
	}
	
	def nthFunctional[A](pos:Int, ls:List[A]):A={
		if(ls.size<pos) throw new NoSuchElementException()
		if(pos==0) return ls.head
		nthFunctional(pos-1, ls.tail)
	}
	
	def nthMatching[A](pos:Int,ls:List[A]):A=(pos,ls) match{
		case (0,h::_) 		=> h
		case (n,_::tail)	=> nthMatching(n-1,tail)
		case (_,Nil)		=> throw new NoSuchElementException
	}
}
