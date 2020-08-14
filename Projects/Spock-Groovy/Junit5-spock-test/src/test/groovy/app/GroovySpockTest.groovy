package app
 
import spock.lang.Specification 

class GroovySpockTest extends Specification
{
     

def "test with HashMap to verify accept null key"() {
  given:
  def map = new HashMap()

  when:
  map.put(null, "elem")

  then:
  notThrown(NullPointerException)
}
}