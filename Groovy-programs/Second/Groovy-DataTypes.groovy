 
println "Welcome, to Groovy World!."


def name= "User name"
def msg = "Hello" +name
println name;
println msg;


print "The type of name here is ";

println name.class.name; 
name= 122;
print "The type of name here is ";
println name.class.name 


name= 122.45;
print "The type of name here is "
println name.class.name 


name= true
print "The type of name here is "
println name.class.name 


def data = ""
print "The type of data is String is  "
println (data instanceof java.lang.String)
