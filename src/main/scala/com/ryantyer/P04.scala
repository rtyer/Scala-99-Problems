package com.ryantyer

object P04{
	
	def builtin[A](ls:List[A]):Int={
		ls.length
	}
	
	def length[A](ls:List[A]):Int=ls match{
		case Nil => 0
		case _::tail => length(tail) + 1
	}
}