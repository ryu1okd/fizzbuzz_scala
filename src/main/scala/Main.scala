object Main extends App {

  (1 to args(0).toInt).map{ i =>
    (i % 3, i % 5) match{
      case (0, 0) => "FIZZBUZZ"
      case (0, _) => "FIZZ"
      case (_, 0) => "BUZZ"
      case _ => i
    }
  }.foreach(println)

}
