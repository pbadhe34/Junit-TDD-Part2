//The Safe Navigation/Dereference Operator

class User{String firstName }

User user
//println user.firstName  // Throws NullPointerException

// Adding a null check, the Java way
if (user != null) {
   println "Java FirstName = ${user.firstName}"
}
else
println "The_user_object_is_not_initializeed" 



// Null check the Groovy way
println "Groovy FirstName = ${user?.firstName}"