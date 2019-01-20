package project_euler_java;

public class Exercise2 implements Solvable {

  public void solve() {
    int sum = 0;
    int prevTerm = 1;
    int lastTerm = 2;
    while (lastTerm < 4000000) {
      if (lastTerm%2 == 0) {
        sum += lastTerm;
      }
      
      int i = lastTerm;
      lastTerm = i + prevTerm;
      prevTerm = i;
    }
    System.out.println("Solution is "+sum);
  }

}
