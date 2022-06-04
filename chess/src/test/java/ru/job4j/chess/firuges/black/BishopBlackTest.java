package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;

import static org.junit.Assert.*;

public class BishopBlackTest {

    @Test
    public void whenPositionA4X0Y4() {
        BishopBlack elephant = new BishopBlack(Cell.A4);
        elephant.position();
        int[] expected = new int[] {0, 4};
        int[] actual = new int[] {elephant.position().getX(), elephant.position().getY()};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void whenCopyPositionB5X1Y3() {
        BishopBlack elephant = new BishopBlack(Cell.A4);
        elephant.copy(Cell.B5);
        int[] expected = new int[] {1, 3};
        int[] actual = new int[] {elephant.copy(Cell.B5).position().getX(), elephant.copy(Cell.B5).position().getY()};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void whenWayD2X3Y6E3X4Y5F4X5Y4G5X6Y3() {
        BishopBlack elephant = new BishopBlack(Cell.C1);
        elephant.way(Cell.G5);
        Cell[] expected = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        Cell[] actual = elephant.way(Cell.G5);
        assertArrayEquals(expected, actual);
    }

    @Test (expected = ImpossibleMoveException.class)
    public void whenWayD2E3F4G5() {
        BishopBlack elephant = new BishopBlack(Cell.C1);
        elephant.way(Cell.C5);
    }

}