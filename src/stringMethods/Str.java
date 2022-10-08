 package stringMethods;

public class Str {
public static void main(String[] args) {
  String Language=("Java is a programming language");
  String Automation=("Selenium is automation testing");
  String Rain=("Raining");
  String Method=("STRING");
  String Empty=("");
//  boolean endsWith=Automation.endsWith("testing");
//  System.out.println(endsWith);
//  boolean contains=Empty.contains(" ");
//  System.out.println(contains);
//  String subString=Language.substring(0,30);
//  System.out.println(subString);
//  boolean empty=Empty.isEmpty();
//  System.out.println(empty);
//  String trim = Automation.trim();
//  System.out.println(trim);
    int lastIndexOf = Automation.lastIndexOf("a");
    System.out.println(lastIndexOf);
    int indexOf = Language.indexOf("p");
    System.out.println(indexOf);
}
}
