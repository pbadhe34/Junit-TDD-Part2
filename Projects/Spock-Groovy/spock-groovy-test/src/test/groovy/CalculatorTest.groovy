package groovy

import app.Calculator
import spock.lang.Specification

//The Groovy test source files (relative paths).
// Default: "${project.basedir}/src/test/groovy/**/*.groovy"

class CalculatorTest extends Specification
{
    def "CalculatorTest for Sum: #a + #b = #expectedResult"()
    {

        given: "Calculator"
        def calc = new Calculator()

        when: "add"
        def result = calc.sum( a, b )

        then: "result is as expected"
        result == expectedResult
        println "result = ${result}"

        where:
        a  | b | expectedResult
        1  | 2 | 3
        -5 | 2 | -2
    }

   def "Normal-Test"()
    {

        expect
    }

}
