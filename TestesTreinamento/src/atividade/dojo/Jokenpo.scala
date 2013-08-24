package atividade.dojo

object Jokenpo extends App {

  val jogada1 = ("pedra", "tesoura")
  val jogada2 = ("pedra", "papel")
  val jogada3 = ("pedra", "pedra")
  val jogada4 = ("tesoura", "tesoura")
  val jogada5 = ("papel", "papel")
  val jogada6 = ("tesoura", "papel")
  
  val movement = 0

  def move(jogador1: Any, jogador2: Any): String = {
   movement  match {
       
      case o if o == "Country" => "Brazil"
      case jogada1 => "Pedra Quebra tesoura"
      case jogada2 => "Papel embrulha pedra"
      case jogada3 => "Empate"
      case jogada4 => "Empate"
      case jogada5 => "Empate"
      case jogada6 => "tesoura corta papel"
    }

  }


  def jogada(jogador1: Any, jogador2: Any) = {    
    
    println(move(jogador1))    
  }  
  
}