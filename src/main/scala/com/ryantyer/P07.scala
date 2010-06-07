package com.ryantyer

object P07{
	def flatten[A](ls:List[A]):List[A]={
		ls.flatMap{
			(elem:A)=>elem match{
				case l:List[A]=>flatten(l)
				case e => List(e)
			}
		}
	}
	
	
}