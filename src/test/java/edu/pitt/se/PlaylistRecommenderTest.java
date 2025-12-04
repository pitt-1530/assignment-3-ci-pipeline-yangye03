package edu.pitt.se;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class PlaylistRecommenderTest {

    @Test
    public void HighEnergyTest() {
        List<Integer> bpms = List.of(150, 160, 148);
        assertEquals("HIGH", PlaylistRecommender.classifyEnergy(bpms));
    }
    @Test
    public void isValidTest(){
        assertTrue(PlaylistRecommender.isValidTrackTitle("hello"));
    }
    @Test
    public void volumnTest(){
        assertEquals(100, PlaylistRecommender.normalizeVolume(130));
    }
}
    
