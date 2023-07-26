class Student {
  int id = 1000;;

  void compute() {
  int nextId = id + 100;
    System.out.println(id + " - id");
    System.out.println("nextId: " + nextId);
  }

  public static void main(String[] agrs) {
    Student s = new Student();
    s.compute();
  }

}