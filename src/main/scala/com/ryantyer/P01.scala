package com.ryantyer

object P01 {
	def lastBuiltins(numbers:List[Any]):Any=numbers.last
	def lastFunctional(members:List[Any]):Any={
		if(members.size==1){
			return members.head
		}
		return lastFunctional(members.tail)
	}
}
