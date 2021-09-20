import java.util.Objects;
import java.util.Scanner;

public class Solution23 {
    private void carIssues(){
        Scanner input = new Scanner(System.in);
        //Display Is the car Silent
        System.out.print("Is your car silent when you turn the key? ");
        String decision = input.nextLine();
        if (Objects.equals(decision, "y")){
            //If yes then display Are the battery terminal corroded
            System.out.print("Are the battery terminals corroded? ");
            decision = input.nextLine();

            if(Objects.equals(decision, "y")){
                //If yes then Display  clean Terminals and try again STOP
                System.out.print("Clean terminals and try starting again. ");
            }
            //else then Display  Replace cables and try again STOP
            else{
                System.out.print("Replace cables and try again.");
            }

        }
        //else(no side of Silent) Display Does car make slicking noise
        else{
            System.out.print("Does the car make slicking noise? ");
            decision = input.nextLine();
            if(Objects.equals(decision, "y")) {
                //If yes Display the battery and STOP
                System.out.print("Replace the battery");
            }
            else{
                //else(no) Does the car Crank up but fail
                System.out.print("Does the crank up but fail to start? ");
                decision = input.nextLine();
                if(Objects.equals(decision, "y")){
                    //if yes Display Check spark plug connections STOP
                    System.out.print("Check the spark plug connections. ");
                }
                //else(no) Display Does Engine start and then die
                else{
                    System.out.print("Does the car start then die? ");
                    decision = input.nextLine();
                    //If yes Display Does your car have fuel injections
                    if(Objects.equals(decision, "y")){
                        System.out.print("Does you car have fuel injections? ");
                        decision = input.nextLine();
                        //if yes Get it in service STOP
                        if(Objects.equals(decision, "y")){
                            System.out.print("Get it in to for service. ");
                        }
                        //else Display Check to ensure the choke is open or close
                        else{
                            System.out.print("Check to ensure the choke is opening and closing.");
                        }
                    }
                    //else(no engine) Display this should be possible
                    else{
                        System.out.print("This should not be possible. ");
                    }

                }

            }

        }
    }
    public static void main(String[] args) {
        Solution23 sol = new Solution23();
        sol.carIssues();


    }
}
