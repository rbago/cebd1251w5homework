object Exercise2 {
  
	val x = List.range(1, 46)                 //> x  : List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 
                                                  //| 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 3
                                                  //| 6, 37, 38, 39, 40, 41, 42, 43, 44, 45)
  val divBy4 = x.filter(_ % 4 == 0)               //> divBy4  : List[Int] = List(4, 8, 12, 16, 20, 24, 28, 32, 36, 40, 44)
  val sumList1 = divBy4.reduce((x, y) => x + y)   //> sumList1  : Int = 264
	
	println(divBy4)                           //> List(4, 8, 12, 16, 20, 24, 28, 32, 36, 40, 44)
	println(sumList1)                         //> 264
	
	
	val divBy3Less20 = x.filter(x => x % 3 == 0 && x < 20)
                                                  //> divBy3Less20  : List[Int] = List(3, 6, 9, 12, 15, 18)
	val squareList = divBy3Less20.map(x => x * x)
                                                  //> squareList  : List[Int] = List(9, 36, 81, 144, 225, 324)
	val sumList2 = squareList.reduce((x, y) => x + y)
                                                  //> sumList2  : Int = 819
  println(squareList)                             //> List(9, 36, 81, 144, 225, 324)
	println(sumList2)                         //> 819
	
}