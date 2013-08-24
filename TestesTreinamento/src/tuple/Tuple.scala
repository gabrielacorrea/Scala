
package tuple

object Tuple extends App {

  val role = ("engineer", "civil")

  println("Cargo: " + role._1)
  println("Area: " + role._2)

  
  def matchRole() = {
    role match {
      case ("design", "marketing") => "Use publicity"
      case ("engineer", "civil") => "Construction"
    }
  }

  println(matchRole)

}

