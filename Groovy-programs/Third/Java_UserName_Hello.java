 
public class Java_UserName_Hello
{
   public static void main( String args[])
   {
      UserName name = new UserName();
      name.setFirstName( args[0] );
      System.out.println( name.toString() );
   }
}