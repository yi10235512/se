package se.hw;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LetterGradeTest {
    @Test
    public void should_get_X_when_enter_negative_10(){
        assertEquals('X', LetterGrade.letterGrade(-10));
    }
    @Test
    public void should_get_F_when_enter_30(){
        assertEquals('F', LetterGrade.letterGrade(30));
    }
    @Test
    public void should_get_D_when_enter_65(){
        assertEquals('D', LetterGrade.letterGrade(65));
    }
    @Test
    public void should_get_C_when_enter_75(){
        assertEquals('C', LetterGrade.letterGrade(75));
    }
    @Test
    public void should_get_B_when_enter_85(){
        assertEquals('B', LetterGrade.letterGrade(85));
    }
    @Test
    public void should_get_A_when_enter_95(){
        assertEquals('A', LetterGrade.letterGrade(95));
    }
    @Test
    public void should_get_X_when_enter_110(){
        assertEquals('X', LetterGrade.letterGrade(110));
    }
}