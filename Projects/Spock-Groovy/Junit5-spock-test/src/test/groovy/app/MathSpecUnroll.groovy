package app

 
import spock.lang.Specification
import spock.lang.Unroll

 class MathSpecUnroll extends Specification {

  @Unroll
  def "maximum of two numbers"() {
    expect:
    Math.max(a, b) == c

    where:
    a | b || c
    1 | 3 || 3
    7 | 4 || 7
    0 | 0 || 0
  }
}