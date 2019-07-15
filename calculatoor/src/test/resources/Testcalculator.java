
import org.junit.jupiter.api.Test;

public class Testcalculator {
	
	@test
	 public void MaxTestNulls(int a, int b, int c)
    {
        Assert.IsNotNull(a, "The first parameter must not be zero.")
        Assert.IsNotNull(b, "The second parameter must not be zero.");
        Assert.IsNotNull(c, "The third parameter mustnot be zero.");
    }
	
	@test
	  public void MaxTestTypes(int a, int b, int c)
    {
        Assert.IsInstanceOfType(a, typeof(int));
        Assert.IsInstanceOfType(b, typeof(int));
        Assert.IsInstanceOfType(c, typeof(int)); 
    }
	@test
	public void testMaxInArray(){
        MaxInArray maxInArray = new MaxInArray();
        Assert.assertEquals(param.getExpectedMax(), maxInArray.findMax(param.getArray()));
    }
}
