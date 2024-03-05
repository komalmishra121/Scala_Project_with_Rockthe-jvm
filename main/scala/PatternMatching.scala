object PatternMatching {

  // Switch Expression

  private val anInteger = 55

  private val order = anInteger match {
    case 1 => "First"
    case 2 => "second"
    case 3 => "third"
    case _ => anInteger + "th"
  }
  // PM is an expression
  println(order)

  case class Person(name: String, age: Int)

  val bob: Person = Person("Bob", 43) // Person.apply("Bob",43)
  private val personGreeting =bob match{
    case Person(n,a) => "Hi, my name $n and I am $a year old"
    case _ => "something else"
  }
  println(personGreeting)
  // deconstructing tuples
  private val aTuple: (String, String) = ("Bon Javi","Rock")
  private val boundDescription = aTuple match{
    case(band,genre) => s"$band belongs to the genre $genre"
    case _ => " I don't know what you're talking about"

    // decomposing lists
    val aList = List(1,2,3)
    val listDescription = aList match{
      case List(_,2,_) => "List containing 2 on its second position"
      case _ => "unknown lists"
    }
    // if PM doesn't match anything it will throw a MatchError
    // PM will try all cases in sequence
  }

}
