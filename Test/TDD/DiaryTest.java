package TDD;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryTest {
    Diary myDiary;
    @BeforeEach
    public void setUp(){
        myDiary = new Diary("CorrectPassword");
    }
    @Test
    public void appExist(){
        assertNotNull(myDiary);
    }
    @Test
    public void diaryIsLockedTest(){
        myDiary.isLocked();
        assertTrue(myDiary.isLocked());
    }
    @Test
    public void diaryLockedCanBeUnlocked(){
        myDiary.isLocked();
        assertTrue(myDiary.isLocked());
        myDiary.unlockWith("password");
        assertFalse(myDiary.isLocked());
    }
    @Test
    public void wrongPasswordWillNotUnlockDiary(){
        myDiary.isLocked();
        assertTrue(myDiary.isLocked());
        myDiary.unlockWith("correctPassword");
        assertTrue(myDiary.isLocked());
    }


}
