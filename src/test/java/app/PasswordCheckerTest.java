package test.java.app;

import main.java.app.PasswordChecker;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PasswordCheckerTest {

    @Test
    public void equivalencePartitioning(){
        PasswordChecker passwordChecker = new PasswordChecker();
        assertFalse(passwordChecker.checkPassword("Te1"));
        assertTrue(passwordChecker.checkPassword("Test123"));
        assertFalse(passwordChecker.checkPassword("TestIsLongerThan16OrSomethingLikeThat"));
    }

    @Test
    public void boundaryValueAnalysis(){
        PasswordChecker passwordChecker = new PasswordChecker();
        assertTrue(passwordChecker.checkPassword("Tes1"));
        assertTrue(passwordChecker.checkPassword("TestIs16Charssss"));
        assertFalse(passwordChecker.checkPassword("Te2"));
        assertTrue(passwordChecker.checkPassword("TestIs15Charsss"));
        assertFalse(passwordChecker.checkPassword("TestIs17Charsssss"));
        assertTrue(passwordChecker.checkPassword("Test1"));
    }

    @Test
    public void categoryPartitioning(){
        PasswordChecker passwordChecker = new PasswordChecker();
        assertTrue(passwordChecker.containsNumber("12321"));
        assertTrue(passwordChecker.containsNumber("1a"));
        assertFalse(passwordChecker.containsNumber("SS"));
        assertFalse(passwordChecker.containsNumber("SDASDSDaadsa"));
        assertFalse(passwordChecker.containsNumber(""));
        assertTrue(passwordChecker.hasLowercase("Aa1"));
        assertTrue(passwordChecker.hasLowercase("sdsjomcasa"));
        assertFalse(passwordChecker.hasLowercase("233"));
        assertFalse(passwordChecker.hasLowercase("SSS"));
        assertFalse(passwordChecker.hasLowercase(""));
        assertTrue(passwordChecker.hasUppercase("AaBb"));
        assertTrue(passwordChecker.hasUppercase("NNN"));
        assertFalse(passwordChecker.hasUppercase("ssytr"));
        assertFalse(passwordChecker.hasUppercase("12566"));
        assertFalse(passwordChecker.hasUppercase(""));

        assertFalse(passwordChecker.checkPassword(""));
        assertFalse(passwordChecker.checkPassword(null));
    }

    @Test
    public void pathCoverage(){
        PasswordChecker passwordChecker = new PasswordChecker();
        assertFalse(passwordChecker.checkPassword("Weh"));
        assertFalse(passwordChecker.checkPassword("wehave"));
        assertFalse(passwordChecker.checkPassword("wehave1"));
        assertFalse(passwordChecker.checkPassword("WEHAVE1"));
        assertTrue(passwordChecker.checkPassword("Wehave1"));
    }

    @Test
    public void statementCoverage(){
        PasswordChecker passwordChecker = new PasswordChecker();
        assertTrue(passwordChecker.checkPassword("teT23"));
    }

    @Test
    public void checkPasswordTest(){
        PasswordChecker passwordChecker = new PasswordChecker();
        assertTrue(passwordChecker.checkPassword("Going3"));
        assertTrue(passwordChecker.checkPassword("Perfect8"));
        assertTrue(passwordChecker.checkPassword("looKin6"));
        assertFalse(passwordChecker.checkPassword("simplepass"));
        assertFalse(passwordChecker.checkPassword("aMoreComplexOne"));
        assertFalse(passwordChecker.checkPassword("Tt1"));
        assertFalse(passwordChecker.checkPassword("LKiPass"));
        assertFalse(passwordChecker.checkPassword("lkipass2"));
        assertFalse(passwordChecker.checkPassword("NULL3"));
        assertFalse(passwordChecker.checkPassword(""));
        assertFalse(passwordChecker.checkPassword(null));
        assertFalse(passwordChecker.checkPassword("JJ12321cacasdsal2132131csaSDSADsa"));
    }
}
