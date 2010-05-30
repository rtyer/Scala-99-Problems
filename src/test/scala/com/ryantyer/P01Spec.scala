package com.ryantyer

import org.scalatest.Spec

class P01Spec() extends Spec {
	//Find the last element of a list.
	
	describe("a solution using built ins"){
		it("should return 8 from List(1,2,4,8)"){
			expect(8){				
				P01.lastBuiltins(List(1,2,4,8))
			}
		}
		
		it("should return 'jane' from List(tom, dick, jane)"){
			expect("jane"){
				P01.lastBuiltins(List("tom", "dick", "jane"))
			}
		}
	}
	
	describe("an functional solution"){
		it("should return 8 from List(1,2,4,8)"){
			expect(8){
				P01.lastFunctional(List(1,2,4,8))			
			}
		}
	}
	
	describe("The 'accepted answer'"){
		it("should return 8 from List(1,2,4,8)"){
			expect(8){
				P01.answer(List(1,2,4,8))			
			}
		}
	}	
}
