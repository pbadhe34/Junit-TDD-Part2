 

import spock.lang.Specification

class HelloSpockApp extends Specification {
  def "HelloSpockApp  length of Spock's and his friends' names in * Trek"() 
{
    expect:
    name.size() == length

    where:
    name     | length
    "Spock"  | 5
    "Kirk1"  | 4
    "Baba"   | 4
  }
}  