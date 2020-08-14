
// Interpolation to evaluate the value

def    g1 =  "1 + 1 equals ${1 + 1}"
println "THe g1 is ${g1}"  //Interpolation

assert g1 == '1 + 1 equals 2'
assert g1 instanceof CharSequence

assert g1 instanceof GString //GString groovy class

def x = 10

def    g2 =  "$x"   // reference
assert g2 == "10"  //conversion

def    g3 =  "${x}" // expression
assert g3 == "10"

// lazy evaluation with a writeable closure!
def g4 = "${ -> x}" // closure for assigning value
x = 20              // value change after definition
assert g4 == "20"   // lazy evaluation!

def me       = 'Tarzan'
def you      = 'Jaan'
def line     = "me $me - you $you"     //string substrutuin during  evaluation                       
assert  line == 'me Tarzan - you Jaan'


def dateMap = [y:1900, m:'june', d:new Date()]

println dateMap.d //extendfed DOT access

 me = "This is $dateMap.y"
 
 def tz = TimeZone.getTimeZone('JP') //GMT NY IST
 def format = 'd MMM YYYY HH:mm:SS z'
 out = "Date is ${new Date().format(format, tz)} !"  //evaluate
 
 println out
 
 greeting = 'Hello Groovy!'
 
 assert 'Hi' + greeting - 'Hello' == 'Hi Groovy!'
 
 
 //GString operations
 
 assert greeting.startsWith('Hello')
 
 assert greeting.getAt(0) == 'H'
 assert greeting[0]       == 'H'
 
 assert greeting.indexOf('Groovy') >= 0
 assert greeting.contains('Groovy')
 
 assert greeting[6..11]  == 'Groovy' //subString
 assert greeting.count('o') == 3
 
 assert 'x'.padLeft(3)      == '  x'
 assert 'x'.padRight(3,'_') == 'x__'
 assert 'x'.center(3)       == ' x '
 assert 'x' * 3             == 'xxx'
 
 println "greeting class is ${greeting.class.name}"
 
 greeting <<= ' Groovy'              //Left shift and assign
                   
 
 println "greeting class NOW is ${greeting.class.name}"
 
// assert greeting instanceof java.lang.StringBuffer
 

println "done with strings"
