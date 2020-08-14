/*
 * Groovy example showing how much less code is required for 
 * the equivilant Todo.java class.
 */
 

class FirstProgram_Bean{

  String name
  String note

}

def list = [
  new FirstProgram_Bean(name:"1", note:"FirstObject"),
  new FirstProgram_Bean(name:"2", note:"Second"),
  new FirstProgram_Bean(name:"3", note:"Third")
]

list.each {
  println "${it.name} ${it.note}"
}
