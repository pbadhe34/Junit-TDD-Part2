/*
 * Java example for the purpose of comparing it to the equivilant groovy file GroovyApp.groovy.
 */
 

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class FirstProgram{
  private String name;
  private String note;

  public FirstProgram() {}

  public FirstProgram(String name, String note) {
    this.name = name;
    this.note = note;
  }

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public static void main(String[] args) {
    List objects = new ArrayList();
    objects.add(new FirstProgram("1", "one"));
    objects.add(new FirstProgram("2", "two"));
    objects.add(new FirstProgram("3","three"));

    for(Iterator iter = objects.iterator();iter.hasNext();) {
      FirstProgram obj = (FirstProgram)iter.next();
        System.out.println(obj.getName() + " " + obj.getNote());
    }
  }
}
