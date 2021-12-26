package com.example.rockPaperScissorsTDD;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class GameTest {

    Rock rock;
    Paper paper;
    Scissors scissors;
    Player player;
    Player cpu;

    @BeforeEach
    void setUp() {
        rock = new Rock();
        paper = new Paper();
        scissors = new Scissors();
        player = new Player("player1");
        cpu = new Player("cpu");
    }

    @Test
    void player1_wins_with_rock_vs_cpu_scissors() {

    }
}