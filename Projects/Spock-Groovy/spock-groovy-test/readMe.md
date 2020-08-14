
To run individual test class
The value for the test parameter is the name of the test class
 test -Dtest=app.test.BasicTestSpecification

 test -Dtest=CalculatorTest 
 
 test -Dtest=app.test.ItemServiceUnitTest
 
 
 
 test -Dtest=AssertionTest
 
 
From command line 
mvn:test -Dtest=app.test.BasicTestSpecification
 
use patterns to run a number of tests:

mvn -Dtest=Test* test

Use multiple names/patterns, separated by commas:

 -Dtest=TestSquare,TestCi*le test

Specify the test method name to run
   
  -Dtest=app.test.BasicTestSpecification#"The POW Test" test
  
  -Dtest=app.test.BasicTestSpecification#"mymock-test" test

Use patterns with test methods

 -Dtest=app.test.BasicTestSpecification##test* test

select multiple test methods  to run

   test -Dtest=app.test.BasicTestSpecification#mymock-test+"The POW Test"
   
   
   
   
   