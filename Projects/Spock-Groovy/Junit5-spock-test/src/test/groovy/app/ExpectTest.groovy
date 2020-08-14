package app

 
import spock.lang.Specification 

class ExpectTest extends Specification
{
    def "expectTest"()
    {


 when:
def x = Math.max(1, 2)

then:
x == 2
expect:
Math.max(1, 2) == 2
}
}