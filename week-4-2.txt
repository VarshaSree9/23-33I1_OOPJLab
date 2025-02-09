import java.io.*;
import java.lang.*;
import java.util.*;

 class Animal
 {
  void sound()
  {
   System.out.println("Animals makes different sounds");
  }
 }
 
 class Dog extends Animal
 {
  void bark()
  {
   System.out.println("Dogs bark at bstrangers");
  }
 }

 class Puppy extends Dog
 {
  void weep()
  {
   System.out.println("Puppies weep at others");
  }
 }

 public class MultilevelInheritance
 {
  public static void main(String[] args)
  {
   Puppy obj=new Puppy();
   obj.sound();
   obj.bark();
   obj.weep();
  }
 }