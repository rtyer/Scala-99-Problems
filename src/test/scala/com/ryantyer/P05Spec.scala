package com.ryantyer

import org.scalatest.Spec

class P05Spec extends Spec{
	describe("solution to:  Reverse a list."){
		describe("builtin"){
			it("should return List(3,2,1) from builtin(List(1,2,3))"){
				expect(List(3,2,1)){
					P05.builtin(List(1,2,3))
				}
			}
		}
		describe("custom"){
			it("should return List(3,2,1) from reverse(List(1,2,3))"){
				expect(List(3,2,1)){
					P05.reverse(List(1,2,3))					
				}
			}
		}
		describe("folding"){
			it("should return List(3,2,1) from reverse(List(1,2,3))"){
				expect(List(3,2,1)){
					P05.fold(List(1,2,3))					
				}
			}
		}
	}
}