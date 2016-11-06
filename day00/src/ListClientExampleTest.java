import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * @author downey
 *
 */
public class ListClientExampleTest {

	@Test
	public void testListClientExample() {
		ListClientExample lce = new ListClientExample();
		List list = lce.getList();
		assertThat(list, instanceOf(ArrayList.class) );
	}

}
