object Practice00 {

// Data types exploration:
  val hello : String = "Hello!"                   //> hello  : String = Hello!
  val number : Int = 2                            //> number  : Int = 2
  val truth : Boolean = true                      //> truth  : Boolean = true
  val lie : Boolean = false                       //> lie  : Boolean = false
  val letter : Char = 'c'                         //> letter  : Char = c
  val pi : Double = 3.14159265                    //> pi  : Double = 3.14159265
  val piSinglePrecision : Float = 3.14159265f     //> piSinglePrecision  : Float = 3.1415927
  val bigNumber : Long = 1234567890l              //> bigNumber  : Long = 1234567890
  val smallNumber : Byte = 123                    //> smallNumber  : Byte = 123
  
  
  
 // Building strings using concatination:
  println("This is a random string: " + number + truth + hello)
                                                  //> This is a random string: 2trueHello!
  
  
  
 // Doubling pi then printing to 3 decimal places:
  val doublePi = pi * 2                           //> doublePi  : Double = 6.2831853
  println(f"The double of pi is about: $doublePi%.3f")
                                                  //> The double of pi is about: 6.283
  
  
  
// Matching case values
  val numberMatch = 4                             //> numberMatch  : Int = 4
  numberMatch match {
  	case 1 => println("One")
  	case 2 => println("Two")
  	case 3 => println("Three")
  	case _ => println("Something Else")
  }                                               //> Something Else
  
  
  
 // Creating a Fibonacci Sequence for the first 10 values:
  var now = 0;                                    //> now  : Int = 0
  var prev = 1;                                   //> prev  : Int = 1
  println(now);                                   //> 0
  for (x <- 2 to 10) {
  	val tmp = now + prev;
  	println(tmp);
  	prev = now;
  	now = tmp;
  }                                               //> 1
                                                  //| 1
                                                  //| 2
                                                  //| 3
                                                  //| 5
                                                  //| 8
                                                  //| 13
                                                  //| 21
                                                  //| 34

}