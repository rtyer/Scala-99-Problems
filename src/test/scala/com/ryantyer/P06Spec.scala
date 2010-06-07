package com.ryantyer

import org.scalatest.Spec

class P06Spec extends Spec{
	describe("solution to determine if a list is a palindrome"){
		describe("solution for isPalindrome(List(1, 2, 3, 2, 1))"){
			expect(true){
				P06.isPalindrome(List(1,2,3,2,1))
			}
			expect(true){
				P06.isPalindrome(List(1,2,2,1))
			}
			expect(false){
				P06.isPalindrome(List(1,2,3,2))
			}
			expect(false){
				P06.isPalindrome(List(1,2,3,1,2))
			}
			expect(false){
				P06.isPalindrome(List(1,2,1,2))
			}
		}
		describe("consise solution"){
			expect(true){
				P06.isPalindromeConcise(List(1,2,3,2,1))
			}
		}
	}
}