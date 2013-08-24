
package patternMatcher

object PatternTypes extends App {

  def testType(parameter: Any): Any = {

    parameter match {

      case i: Int if i > 18 => "Greater then 18"
      case i: Int => i - 3

      case d: Double if d > 30 => d + 9.5

      case text: String => "String is " + text

      case _ => "Parameter=" + parameter

    }
  }

  println(testType(9))

}

