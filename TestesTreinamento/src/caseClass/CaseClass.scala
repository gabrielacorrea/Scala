
package caseClass

case class CaseClass(numberBegin: Int, numberEnd: Int) {
  
  val cont = CaseClass(6, 15)
  val beg = cont.numberBegin
  val end = cont.numberEnd

}

