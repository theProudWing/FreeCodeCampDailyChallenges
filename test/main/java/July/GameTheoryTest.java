package main.java.July;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTheoryTest {

    @Test
    void prisonersDilemmaResult() {

        assertThrows(IllegalArgumentException.class,
                () -> GameTheory.prisonersDilemmaResult("C", "CDCD"));
        assertThrows(IllegalArgumentException.class,
                () -> GameTheory.prisonersDilemmaResult("CCCDDD", ""));
        assertThrows(IllegalArgumentException.class,
                () -> GameTheory.prisonersDilemmaResult("Defect", "Cooperate"));

        assertArrayEquals(new int[]{12, 12},
                GameTheory.prisonersDilemmaResult("CCCC", "CCCC")
        );
        assertArrayEquals(new int[]{4, 4},
                GameTheory.prisonersDilemmaResult("DDDD", "DDDD")
        );
        assertArrayEquals(new int[]{5, 10},
                GameTheory.prisonersDilemmaResult("CCDD", "CDDD")
        );
        assertArrayEquals(new int[]{24, 34},
                GameTheory.prisonersDilemmaResult("CCCDCDCCCDDC", "CCDDCDCDDCCD")
        );
        assertArrayEquals(new int[]{66, 21},
                GameTheory.prisonersDilemmaResult("DDCCDDDDCDDCDDDCDD", "CCDCCCDCCCDCCCCDCC")
        );

    }
}