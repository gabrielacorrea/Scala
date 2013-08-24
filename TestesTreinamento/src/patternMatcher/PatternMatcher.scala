
package patternMatcher

object PatternMatcher extends App {

  def testString(word: Any): Any = {

    word match {

      case "Name" => "Carlos"
      case "Age" => 12

      case o if o == "Country" => "Brazil"

      case _ => "Other"

    }

  }

  println(testString("Country"))

}