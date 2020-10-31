

object exercise1c {
  
  def cube(x: Int) = {x * x * x}
  
  def main(args: Array[String]) {
    
    val numberList = List.range(1, 9)
  
    val numbers = numberList.map(cube)
    
    println(numbers)
  
  }
  
}