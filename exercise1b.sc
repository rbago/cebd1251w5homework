object exercise2 {

	// Create a list of integers from 1-9
	val numbers = List.range(1, 9)            //> numbers  : List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8)
	
	// Remove the even numbers and make a new list
	def isEven(i: Int) = i % 2 == 0           //> isEven: (i: Int)Boolean
  
	val numbers2 = numbers.filter(isEven)     //> numbers2  : List[Int] = List(2, 4, 6, 8)
}

//def factorial(x: Int) : Int = {
//(1 to x).reduce((x: Int, y: Int) => x * y)
//}