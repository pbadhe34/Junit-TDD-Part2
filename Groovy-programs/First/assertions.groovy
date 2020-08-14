#!Run here  //shebang line

assert(true)
assert !false

assert ! null

assert 1 == 1
def    x =  1
assert x == 1

assert new Integer(1) == new Long(1) //invokes compares method

//assert new Integer(1).equals(new Long(1))

def    y =  1 ; assert y == 1

assert 1 in [0, 1, 2]       // list
assert 1 in 0..3            // range
assert 'Hello' in String    // class
assert 'Hello' in ~/H.*/    // pattern

//assert maps as non empty
assert ['a':1]                                          
assert ![:]


if (x == 2) {                                           
	assert false
}

//In java this is valid But an assignment BUG!
/*if (x = 2) {                                          
   println x
}
*/

while (x =  2) {                                        
	println x
	break
}


//assert iterator
Iterator iter = [2].iterator()
//Iterators must have next element

assert iter  
                                          
iter.next()    
                                        
assert !iter

     //assert Non empty strings                       
assert 'a'                                              
assert !''

class User {
	boolean asBoolean() { false }               
}

assert new Object() //defualt is true

assert ! new User()  //Calls asBoolean()   

//Ternaery params may have different types

def result = (1==1) ? 'ok' : 'failed'
assert result == 'ok'

result = 'some string' ? 10 : ['x']
assert result == 10


 println "Assertions all true"