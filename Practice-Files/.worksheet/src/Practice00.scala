object Practice00 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(79); 

// Data types exploration:
  val hello : String = "Hello!";System.out.println("""hello  : String = """ + $show(hello ));$skip(23); 
  val number : Int = 2;System.out.println("""number  : Int = """ + $show(number ));$skip(29); 
  val truth : Boolean = true;System.out.println("""truth  : Boolean = """ + $show(truth ));$skip(28); 
  val lie : Boolean = false;System.out.println("""lie  : Boolean = """ + $show(lie ));$skip(26); 
  val letter : Char = 'c';System.out.println("""letter  : Char = """ + $show(letter ));$skip(31); 
  val pi : Double = 3.14159265;System.out.println("""pi  : Double = """ + $show(pi ));$skip(46); 
  val piSinglePrecision : Float = 3.14159265f;System.out.println("""piSinglePrecision  : Float = """ + $show(piSinglePrecision ));$skip(37); 
  val bigNumber : Long = 1234567890l;System.out.println("""bigNumber  : Long = """ + $show(bigNumber ));$skip(31); 
  val smallNumber : Byte = 123;System.out.println("""smallNumber  : Byte = """ + $show(smallNumber ));$skip(115); 
  
  
  
 // Building strings using concatination:
  println("This is a random string: " + number + truth + hello);$skip(84); 
  
  
  
 // Doubling pi then printing to 3 decimal places:
  val doublePi = pi * 2;System.out.println("""doublePi  : Double = """ + $show(doublePi ));$skip(55); 
  println(f"The double of pi is about: $doublePi%.3f");$skip(55); 
  
  
  
// Matching case values
  val numberMatch = 4;System.out.println("""numberMatch  : Int = """ + $show(numberMatch ));$skip(151); 
  numberMatch match {
  	case 1 => println("One")
  	case 2 => println("Two")
  	case 3 => println("Three")
  	case _ => println("Something Else")
  };$skip(83); 
  
  
  
 // Creating a Fibonacci Sequence for the first 10 values:
  var now = 0;System.out.println("""now  : Int = """ + $show(now ));$skip(16); ;
  var prev = 1;System.out.println("""prev  : Int = """ + $show(prev ));$skip(16); ;
  println(now);$skip(98); ;
  for (x <- 2 to 10) {
  	val tmp = now + prev;
  	println(tmp);
  	prev = now;
  	now = tmp;
  }}

}
