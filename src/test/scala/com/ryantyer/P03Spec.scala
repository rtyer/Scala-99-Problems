package com.ryantyer

import org.scalatest.Spec

class P03Spec extends Spec{
	//Find the Kth element of a list.
	describe("a solution to find the Kth item of a list"){
		describe("imperative"){
			it("should return 2 from nth(2, List(1, 1, 2, 3, 5, 8))"){
				expect(2){
					P03.nth(2, List(1,1,2,3,5,8))
				}
			}
		}
		describe("functional"){
			it("should return 3 from nthFunctional(3, List(1,1,2,3,5,8))"){
				expect(3){
					P03.nthFunctional(3,List(1,1,2,3,5,8))					
				}
			}
			it("should throw exception when size of list is less than position"){
				intercept[java.util.NoSuchElementException]{
					P03.nthFunctional(3,List(1))
				}
			}
			it("should return last element when requesting last"){
				expect(3){
					P03.nthFunctional(3,List(1,1,2,3))
				}
			}				
		}
		describe("matching"){
			it("should return 3 from nthFunctional(3, List(1,1,2,3,5,8))"){
				expect(3){
					P03.nthMatching(3,List(1,1,2,3,5,8))
				}
			}
			it("should throw exception when size of list is less than position"){
				intercept[java.util.NoSuchElementException]{
					P03.nthMatching(3,List(1))
				}
			}
			it("should return last element when requesting last"){
				expect(3){
					P03.nthMatching(3,List(1,1,2,3))
				}
			}				
		}
	}
}