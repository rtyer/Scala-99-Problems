package com.ryantyer

import org.scalatest.Spec

class P04Spec extends Spec{
	describe("Solution to problem: Find the number of elements of a list."){
		describe("built in"){
			it("should return 6 for length(List(1, 1, 2, 3, 5, 8))"){
				expect(6){
					P04.builtin(List(1, 1, 2, 3, 5, 8))
				}
			}
			it("should return 0 for empty list"){
				expect(0){
					P04.builtin(List())
				}
			}
		}
		describe("custom"){
			it("should return 6 for length(List(1, 1, 2, 3, 5, 8))"){
				expect(6){
					P04.length(List(1, 1, 2, 3, 5, 8))
				}
			}
			it("should return 0 for empty list"){
				expect(0){
					P04.length(List())
				}
			}
		}
	}
}