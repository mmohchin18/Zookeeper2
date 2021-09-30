import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BatTest{
    @Test
    @DisplayName("Flying Test")
    public void TestifBatCanFly(){
        Bat testBat = new Bat();
        assertEquals("Flying because it's not windy", testBat.flying(true), "Unexpected return");
    }

}



//    @Test
//    @DisplayName("Tests date of birth getter and setter")
//    public void dobGetterSetterTest() {
//        Cat testCat = new Cat(10.3, "Sphinx", LocalDate.now(), 30);
//        testCat.setDateOfBirth(LocalDate.ofYearDay(2020, 1));
//        assertEquals(2020, testCat.getDateOfBirth(), "Unexpected date returned");
//    }