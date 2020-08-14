def test() {
	throw new IllegalArgumentException()
}

def log = []
try {
	test()
} catch (Exception e) {
	log << e.toString()
} finally {
	log << 'finally'
}
assert log.size() == 2

// assert the fall--haldle the error

def a = 1
try {
	assert a == 2
} catch (AssertionError error) {
	assert "\n" + error.message =='''
assert a == 2
       | |
       1 false'''
}
//Using the null type

try {
	if (Math.random() < 0.5) 1 / 0
	else null.hashCode()
  } catch (ArithmeticException | NullPointerException exception) {
	println "THe error is ${exception.class.name}"
  }
  

println "done"