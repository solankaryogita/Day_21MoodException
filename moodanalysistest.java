package day21MoodAnalysis;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MoodAnalyserTest {

	@Test
	void moodanalyse() {
		MoodAnalyse moodAnalyser = new MoodAnalyse();
		assertEquals("happy",moodAnalyser.mood());
	}

}

