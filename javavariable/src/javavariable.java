
public class javavariable {
//datatypes
//class level vars

public static void main(String[] args) throws Exception {
    // datatype varname [=value];
    int games = 3;
    double allowance = 40.50;
    long battlepass; //We define battlepass
    battlepass = 15;//We assign a value to battle pass
    
    // Print out our vars values along with a string that explains our values
    System.out.printLn("Number of games I own = " + games);
    System.out.println("My monthly allowance =" + allowance);
    System.out.println("Cost of a single battle pass =" + battlepass);

    //With our current Allowance, how many battle passes will we be able to buy
System.out.println("I can buy" + allowance/battlepass + "battlepasses");
    //What is the total cost of all 3 battle passes
System.out.println("All 3 battlepasses cost would $" + battlepass*games);

    }
}
