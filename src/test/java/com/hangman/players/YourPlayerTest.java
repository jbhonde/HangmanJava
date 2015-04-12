package com.hangman.players;

import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.assertEquals;

public class YourPlayerTest {
    @Test
    public void GuessesAWhenThereAreNoSuccessfulCharactersGuessedYet() {
        YourPlayer player = new YourPlayer();

        char guess = player.GetGuess(Arrays.asList('_', '_', '_'));

        assertEquals('a', guess);
    }

    @Test
    public void GuessesAWhenThereAreSuccessfulCharactersGuessedThatAreNotA() {
        YourPlayer player = new YourPlayer();

        char guess = player.GetGuess(Arrays.asList('m', '_', 'n'));

        assertEquals('a', guess);
    }

    @Test
    public void GuessesAWhenAIsThereAreAsInTheClueAsWell() {
        YourPlayer player = new YourPlayer();

        char guess = player.GetGuess(Arrays.asList('_', 'a', '_'));

        assertEquals('a', guess);
    }
}
