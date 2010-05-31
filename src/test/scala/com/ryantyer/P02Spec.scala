package com.ryantyer

import org.scalatest.Spec

class P02Spec() extends Spec {
	describe("an imperative solution"){
		it("should return 4 from List(1,2,4,8)"){
			expect(4){
				P02.imperativeSecondToLast(List(1,2,4,8))
			}					
		}
		it("should return dick from List(tom,dick,jane)"){
			expect("dick"){
				P02.imperativeSecondToLast(List("tom", "dick", "jane"))
			}
		}
	}
	
	describe("a functinonal solution"){
		it("should return 4 from List(1,2,4,8)"){
			expect(4){
				P02.functionalSecondToLast(List(1,2,4,8))
			}
		}
	}	
	describe("a functinonal solution with matching"){
		it("should return 4 from List(1,2,4,8)"){
			expect(4){
				P02.functionalMatchingSecondToLast(List(1,2,4,8))
			}
		}
	}
}
