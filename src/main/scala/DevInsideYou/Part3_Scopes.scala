package DevInsideYou

object Part3_Scopes {
  def main(args: Array[String]): Unit = {

    println()
    {
      val myFavouriteNumber = {
        println({"Line 9"}) //side effect --> println({}) --> cannot store because executed already.
        println({})
        1337
      }
      println(s"My first number is: $myFavouriteNumber")
    }
    {
      var mySecondNumber= {       // Initialization
        println("I am running on line 17" )
        1881
      }
      mySecondNumber=8118         // Assignment or Re-assignment

      println(s"My second number is: $mySecondNumber")
    }
    println()
  }

}

/*
 printline has it's own scope and we can inject something into that scope.
 expression is always evaluated to something so that you want to store somewhere.
 a statement is something that produces a side effect.
 Lazy Val 1st time behaves like Def and after that behaves like Val.

  Val is a value (Stored in a memory.)
  Def is a definition (only the computation is stored)
  lazy val (behaves 1st time like a def and like val afterwards)
  Var is a variable (Stored in memory like val, but can be re-assigned)
*/