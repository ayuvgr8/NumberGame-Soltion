
// inherit from the GameRule interface
public class AdditionRule implements GameRule{

    // This rule adds all the items in the input array and returns the final result.
  @Override
  public int calculateResult(int[] input) {
        //TODO
        int result = 0;
         for(int i: input) {
           result = result+i;
         }
         return result;
     
    } 
  public String toString() {
		return "AdditionRule"; 
	}
}