package com.ryantyer

object P08{
	//only works for single dupes (a,a)...fails on (a,a,a)
	def elim(ls:List[Any]):List[Any]=ls match{
		case h::j::tail => if(h==j)h::elim(tail); else h::elim(j::tail)
		case h::tail    => h::elim(tail)
		case Nil        => List()
	}
}