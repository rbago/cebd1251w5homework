object exercise3 {
	
  def getMax(f: (Int, Int) => Int, x: Int, y: Int): Unit = {
  
  	val result = f(x, y)
  	println(result)
  
  }                                               //> getMax: (f: (Int, Int) => Int, x: Int, y: Int)Unit
	
	def max(x: Int, y: Int): Int = {
		if (x > y){
			x
		}else{
			y
		}
	}                                         //> max: (x: Int, y: Int)Int
	
	getMax(max, 55, 11)                       //> 55
}