// Exercise to see functions within functions

object exercise1 {

  def frame(name: String, f: (String) => String) : String = { f(name) }
                                                  //> frame: (name: String, f: String => String)String
  
  def greet1(name: String) : String = { "Hello " + name + ", How are your doing?" }
                                                  //> greet1: (name: String)String
  
  
  def greet2(name: String) : String = { "Hello " + name + ", How was your day?" }
                                                  //> greet2: (name: String)String
 
  
  println(frame("Alice", greet1))                 //> Hello Alice, How are your doing?
  println(frame("Nick", greet2))                  //> Hello Nick, How was your day?
  
  
}