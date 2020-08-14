 

import spock.lang.Specification

class HelloSpockSpec extends Specification {
  def "HelloSpockSpec  Measure and compare the length names"() {
    
    expect:
    name.size() == length

    where:
    name     | length
    "Spock"  | 5
    "Kishor" | 4
    "Rand"   | 0
  }
}  