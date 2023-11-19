package lectures.part1basics

object Expressions_2 extends App {

  val x = 1 + 2 // EXPRESSION
  println(x)

  /*
  Expressions are evaluated to a value in this case three, and they have a type in this case INT And
  now, as I said before, the compiler is smart enough to figure out the types of values depending on
  what's on the right hand side.
  So the fact that this is an expression and it has a type allows the compiler to set the type of X to
  INT.
  */
  println(2 + 3 * 4)
  // + - * / & | ^ << >> >>> (right shift with zero extension)

  println(1 == x)
  // == != > >= < <=

  println(!(1 == x))
  // ! && ||

  var aVariable = 2
  aVariable += 3 // also works with -= *= /= ..... side effects
  println(aVariable)

  // Instructions (DO) vs Expressions (VALUE)

  /*
  In Scala and in functional programming in general, we'll think in terms of expressions.
  That is, every single bit of your code will compute a value.
  */

  //IF EXPRESSION
  val aCondition= true
  val aConditionedValue=if(aCondition) 7 else 3  // IF EXPRESSION not an IF Instruction
  println(aConditionedValue)
  println(if(aCondition) 7 else 3)  // Note: IF in Scala is an expression.

/*
there are loops in Scala, but we discourage using them because they're
reminiscent of imperative programming like Java.
They don't really return anything meaningful and only execute side effects.
*/

  //Loops
  // But please avoid while loops like the plague.

  var i=0
  while (i<10) {
    println(i)
    i+=1
  }
  //NEVER WRITE THIS AGAIN.

  /*
  That's because while and looping in general is very specific to imperative programming that is Java
  or Python or C, the single worst thing a Scala programmer can do really is write imperative code with
  the Scala syntax.
  So please don't do this.
  We're talking about instructions and expressions and the difference between them and Scala forces everything
  to be an expression.
  So everything in Scala is an expression.
  */

  val aWeirdValue= (aVariable=3) // Unit === void
  println(aWeirdValue)
  // Side effects: println(), whiles, reassigning
  /*
  Unit is a very special type in Scala, which is equivalent to void in other languages, and it just
  means don't return anything meaningful.
  So we said in the last video that reassigning a variable is a side effect.
  Now, side effects in Scala are actually expressions returning unit.
  */

  //Code Blocks

  val aCodeBlock={
    val y=2
    val z=y+1

    if(z>2) "hello" else "goodbye"
  }


  /*
  Code blocks are a special kind of expressions because they have some special properties.
  1) a code block is an expression.Like everything else in Scala,
  the value of the block is the value of its last expression.
  So the value of this whole block is the value of this if expression because it occurs last.
  Inside everything you declare inside the code block stays visible within the code block.
  */

  /*
     the value of the block is the value of its last expression.
  #Expressions vs Instructions:
  instructions are executed(think java), expressions are evaluated(Scala)
  */

  /* 1. difference between "hello world" vs println("hello world")?
  This guy is a value of type string A Hello World is a string literal.
  We like to say the print line,
  Hello World is an expression which is a side effect.
  And if you've paid attention to side effects, they are expressions returning unit.
  */

  val someValue = {
    2 < 3
  }
  println(someValue)

  val someOtherValue = {
    if (someValue) 239 else 986
    42
  }
  println(someOtherValue)

}
