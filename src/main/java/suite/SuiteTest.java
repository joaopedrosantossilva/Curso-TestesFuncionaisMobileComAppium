package suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import test.CadastroContaTest;
import test.MovimentacoesTest;

@RunWith(Suite.class)
@SuiteClasses({
	CadastroContaTest.class,
	MovimentacoesTest.class})

public class SuiteTest {

}
