package se.hw;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class LetterGradeBoundaryTest {
    @Test
    public void should_get_right_grade_by_boundary_0(){
        assertEquals('X', LetterGrade.letterGrade(-1));
        assertEquals('F', LetterGrade.letterGrade(0));
        assertEquals('F', LetterGrade.letterGrade(1));
    }
    @Test
    public void should_get_right_grade_by_boundary_60(){
        assertEquals('F', LetterGrade.letterGrade(59));
        assertEquals('D', LetterGrade.letterGrade(60));
        assertEquals('D', LetterGrade.letterGrade(61));
    }
    @Test
    public void should_get_right_grade_by_boundary_70(){
        assertEquals('D', LetterGrade.letterGrade(69));
        assertEquals('C', LetterGrade.letterGrade(70));
        assertEquals('C', LetterGrade.letterGrade(71));
    }
    @Test
    public void should_get_right_grade_by_boundary_80(){
        assertEquals('C', LetterGrade.letterGrade(79));
        assertEquals('B', LetterGrade.letterGrade(80));
        assertEquals('B', LetterGrade.letterGrade(81));
    }
    @Test
    public void should_get_right_grade_by_boundary_90(){
        assertEquals('B', LetterGrade.letterGrade(89));
        assertEquals('A', LetterGrade.letterGrade(90));
        assertEquals('A', LetterGrade.letterGrade(91));
    }
    @Test
    public void should_get_right_grade_by_boundary_100(){
        assertEquals('A', LetterGrade.letterGrade(99));
        assertEquals('A', LetterGrade.letterGrade(100));
        assertEquals('X', LetterGrade.letterGrade(101));
    }
}


