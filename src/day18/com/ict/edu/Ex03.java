package day18.com.ict.edu;

public class Ex03 {
   
   private String name;
   private int age;
   private double weight;
   
   public Ex03() {}

   public Ex03(String name, int age, double weight) {

      this.name = name;
      this.age = age;
      this.weight = weight;
   }
   //생성자 인자에 뭔가가 있으면, 기본적으로 이것들은 전역변수로 빼줘야한다. 
   
   
   public String getName() {
      return name;
   }
   public void setName(String name) {
      this.name = name;
   }
   public int getAge() {
      return age;
   }
   public void setAge(int age) {
      this.age = age;
   }
   public double getWeight() {
      return weight;
   }
   public void setWeight(double weight) {
      this.weight = weight;
   }
   }  //클래스



