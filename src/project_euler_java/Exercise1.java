package project_euler_java;

public class Exercise1 implements Solvable {

  
  @Override
  public void solve() {
    int sum = 0;
    for (int i = 0; i < 1000; i++) {
      if (i%3 == 0 || i%5 == 0) {
        sum = sum + i;
        //sum += i
      }
    }
    System.out.println("Solution is "+sum);
  }
}
