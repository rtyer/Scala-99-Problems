package com.ryantyer

object P06{
	def isPalindrome(ls:List[Int]):Boolean={
		val pair = ls.splitAt(ls.length/2)
		var listOne = pair._1.reverse
		var listTwo = pair._2
		
		if(listOne.length > listTwo.length){			
			listOne = listOne.init

		}else if(listOne.length < listTwo.length){
			listTwo = listTwo.tail
		}
		println(listOne)
		println(listTwo)
		
		return (listOne ==  listTwo)
	}
	def isPalindromeConcise(ls:List[Int]):Boolean={
		ls.reverse == ls
	}
}