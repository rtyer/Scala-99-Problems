package com.ryantyer

import org.scalatest.Spec

class P01Spec() extends Spec {
	//Find the last element of a list.
	
	describe("a solution using built ins"){
		it("should return 8 from List(1,2,4,8)"){
			expect(8){				
				new P01(List(1,2,4,8)).solutionA
			}
		}
		
		it("should return 'jane' from List(tom, dick, jane)"){
			expect("jane"){
				new P01(List("tom", "dick", "jane")).solutionA
			}
		}
	}
	
	describe("an alternative solution"){
		it("should return 8 from List(1,2,4,8)"){
			expect(8){
				new P01(List(1,2,4,8)).solutionB
			}
		}
	}	
}
