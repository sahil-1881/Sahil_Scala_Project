package lectures.part1basics

object Functions_3 extends App {

  def aFunction(a:String, b:Int):String= {
    a+ " " +b
  }
  println(aFunction("Sahil",8))

  def aParameterlessFunction():Int=42
  println(aParameterlessFunction())

  def aRepeatedFunction(aString:String, n:Int):String={
    if(n==1) aString
    else aString + aRepeatedFunction(aString,n-1)
  }
  println(aRepeatedFunction("Hello",3))
  // WHEN YOU NEED LOOPS, USE RECURSION

  /*
  We normally need functions with side effects if we want something that has nothing to do with computation
  itself, for example, printing something to the console, displaying something on screen, logging
  something or writing to a file, etc.
  */



}
