package com.ryantyer

import org.scalatest.Spec

class P08Spec extends Spec{
	describe("a solution to eliminate consecutive duplicates of list elements."){
		it("should eliminate duplicate 'a' in List(a,a,b,c)"){
			expect(List('a','b','c')){
				P08.elim(List('a','a','b','c'))
			}
			expect(List('a, 'b, 'c, 'a, 'd, 'e)){
				P08.elim(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
			}
		}
	}
}