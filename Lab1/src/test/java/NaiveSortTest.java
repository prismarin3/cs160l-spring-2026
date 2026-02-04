
import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;

import static org.junit.jupiter.api.Assertions.assertTrue;


import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class NaiveSortTest {

	String[] promotionOrder = null;
	
	@InjectMocks
    NaiveSort nSort;

    @Mock
    NaiveSort.sortingSolution sortSol;
	
	void assertResults(String[] expected, String[] actual) {
		assertTrue(expected.length == actual.length);
		for (int i = 0; i < expected.length; i++) {
			assertTrue(expected[i].equalsIgnoreCase(actual[i]));
		}
	}

	@BeforeAll
    public static void beforeClass() {
        // This method will be executed once on initialization time
    }

	@BeforeEach
	public void before() {
		// This method will be executed once before each test execution
		promotionOrder = new String[] { "mz", "mx", "my" };
    }

    @AfterAll
    public static void afterClass() {
        // This method will be executed once when all tests are executed
    }

    @AfterEach
    public void after() {
        // This method will be executed once after each test execution
    }
    
	@org.junit.jupiter.api.Test
	public void carInvMoreThan3Cars() {
		String[] carInventory = new String[] { "mz", "my", "my", "mx", "mz", "mx", "my", "mz" };

		assertThat(nSort.sortCarInventory(carInventory, promotionOrder))
                .hasSize(8)
				//Student TODO, Add the expected result
                .containsExactly();
	}

	@Test
	public void carInv2ModelsOfCars() {
		//Student TODO: 
		//Change the following code to use the SAME mocking approach as in 
		//carInvMoreThan3Cars above for testing
		String[] carInventory = new String[] { "my", "my", "mx", "mx", "my" };
		String[] expectedRes = new String[] { "mx", "mx", "my", "my", "my" };
		String[] actualRes = (new NaiveSort()).sortCarInventory(carInventory, promotionOrder);
		assertResults(expectedRes, actualRes);		
	}
	
	@Test
	public void carInv2Cars() {
		//Student TODO: 
		//Change the following code to use the SAME mocking approach as in 
		//carInvMoreThan3Cars above for testing
		String[] carInventory = new String[] { "mx", "mz" };
		String[] expectedRes = new String[] { "mz", "mx" };
		String[] actualRes = (new NaiveSort()).sortCarInventory(carInventory, promotionOrder);
		assertResults(expectedRes, actualRes);
	}

	@Test
	public void carInv1Car() {
		//Student TODO: 
		//Change the following code to use the SAME mocking approach as in 
		//carInvMoreThan3Cars above for testing
		String[] carInventory = new String[] { "mx" };
		String[] expectedRes = new String[] { "mx" };
		String[] actualRes = (new NaiveSort()).sortCarInventory(carInventory, promotionOrder);
		assertResults(expectedRes, actualRes);
	}
}