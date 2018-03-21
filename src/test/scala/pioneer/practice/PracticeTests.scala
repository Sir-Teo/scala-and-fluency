package pioneer.practice

import org.scalatest.FunSuite

class PracticeTests extends FunSuite {

  /**
    * Tests for `square`
    */

  test("Square of 0 is 0") {
    assert(Practice.square(0) === 0)
  }

  test("Square of 1 is 1") {
    assert(Practice.square(1) === 1)
  }

  test("Square of 2 is 4") {
    assert(Practice.square(2) === 4)
  }

  test("Square of 5 is 25") {
    assert(Practice.square(5) === 25)
  }

  test("Square of 10 is 100") {
    assert(Practice.square(10) === 100)
  }

  test("Square of -1 is 1") {
    assert(Practice.square(-1) === 1)
  }

  /**
    * Tests for `repeat`
    */

  test("Repeating the empty string yields the empty string") {
    assert(Practice.repeat("") === "")
  }

  test("Repeating `a` yields `aa`") {
    assert(Practice.repeat("a") === "aa")
  }

  test("Repeating `repeat` yields `repeatrepeat`") {
    assert(Practice.repeat("repeat") === "repeatrepeat")
  }

  /**
    * Tests for `sleepIn`
    */

  // write your tests here
  test("not a weekday, not on vacation"){
    assert(Practice.sleepin(false,false) === true)
  }

  test("not a weekday, but on vacation"){
    assert(Practice.sleepin(true,false) === false)
  }

  test("is a weekday, but not on vacation"){
    assert(Practice.sleepin(false,true) === true)
  }

  test("both a weekday and on vacation"){
    assert(Practice.sleepin(true,true) === true)
  }
}
