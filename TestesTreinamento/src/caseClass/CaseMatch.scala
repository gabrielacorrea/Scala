package caseClass

object CaseMatch extends App {

  val testeClass = CaseClass(10, 20)

  def calcType(calc: CaseClass) = {
    calc match {
      case CaseClass(5, 10) => "close"
      case CaseClass(10, 20) => "not so far"
      case CaseClass(5, 30) => "very far"
      case CaseClass(_, _) => "Begin " + testeClass.beg + " and end " + testeClass.end
    }
  }

}