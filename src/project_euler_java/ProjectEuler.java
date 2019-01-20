package project_euler_java;


public class ProjectEuler {

  
  public static void main(String[] args) {
    Solvable[] solutions = new Solvable[641];
    solutions[0]  = new Exercise1();
    solutions[1] = new Exercise2();
    for (Solvable solvable : solutions) {
      if (solvable != null) {
        solvable.solve();
      }
      
    }
    
  }

}
