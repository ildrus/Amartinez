import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class AlumneTest {
	Alumne a1,a2;
	
	
	@Before
	public void setUp() throws Exception {
		a1 = new Alumne("Andreu",2,2,2,2);
			
	}

	

	@Test
	public void testEsMajorEdat() {
		assertTrue("auria de mostrar major de edat",a1.esMajorEdat());
	}

	@Test
	public void testAprovaM5() {
		assertTrue("auria de sortir aprovat",a1.AprovaM5());
		
	}

	@Test
	public void testAnysMatriculat() {
		assertTrue("auria de sortir els anys de matricula",a1.AnysMatriculat());
	}

	@Test
	public void testPassaASegon() {
		assertTrue("auria de indicar que pasa a segon any",a1.PassaASegon());
	}

}
