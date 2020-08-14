 

import java.lang.annotation.*

import spock.lang.Specification

/*
 * Shows how methods can be included and excluded from a spec run. For demonstration purposes, the configuration script's location is set programmatically in a static initializer. Usually, the configuration script's location would be set externally (via the same system property), or the configuration script would reside in one of the two default locations:
 * SpockConfig.groovy on the class path 
 * $user_home/.spock/SpockConfig.groovy on the file system</ul>
 *  
 *
 * <p>Note that the configuration script referenced by the system property may either reside on the class path or on the file system (make sure to include the whole path).
 *
 The filtering also works for classes. 
 Whereas methods can only be filtered based on annotations, classes can also be filtered based on their base class.
 *
 *To see the effect of different Spock configurations,
 * just run this spec from your IDE with an additional VM parameter
  
    -Dspock.configuration=IncludeFastConfig.groovy  
 *  -Dspock.configuration=ExcludeSlowConfig.groovy  
 */

class IncludeExcludeExtensionSpec extends Specification {
  @Fast
  def "a fast method"() {
    expect: false
  }

  @Slow
  def "a slow method"() {
    expect: true
  }

  def "a neither fast nor slow method"() {
    expect: true
  }
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Fast {}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Slow {}
