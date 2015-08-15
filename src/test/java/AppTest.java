import org.junit.*;
import static org.junit.Assert.*;
import java.util.Arrays;


public class AppTest {


@Test
  public void wordReturns_withReplaced_Vowels_1() {


    App apptest_1 = new App();
    String phrase = "-ppl-s";
    assertEquals(phrase, apptest_1.replaceVowelsInWord("apples"));

  }
}
