package com.ryantyer

import _root_.org.scalatest.Spec

class P07Spec extends Spec{
	describe("solution to flatten a nexted list"){
		describe("flatten(List(List(1, 1), 2, List(3, List(5, 8))))"){
			it("should create a List(1,1,2,3,5,8) from flatten(List(List(1, 1), 2, List(3, List(5, 8))))"){
				expect(List(1,1,2,3,5,8)){
					P07.flatten(List(List(1, 1), 2, List(3, List(5, 8))))
				}	
			}
		}
	}
}