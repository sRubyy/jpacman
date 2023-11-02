package nl.tudelft.jpacman.board;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for the {@link Board} class.
 * This class contains test methods to ensure the correct behavior of the Board class.
 */
public class BoardTest {

    /**
     * Test the creation of a Board with a single non-null square.
     * This test ensures that a Board object is created correctly and that it maintains its invariant.
     */
    @Test
    void testCreateBoard() {
        BasicSquare x = new BasicSquare();
        Square[][] grid = {{x}};
        Board board = new Board(grid);
        assertThat(board.invariant()).isTrue();
        assertThat(board.squareAt(0, 0)).isEqualTo(grid[0][0]);
    }

    /**
     * Test the creation of a Board with one non-null and one null square.
     * This test checks if a Board object can handle a grid containing a null square
     * and whether it maintains its invariant in such a case.
     */
    @Test
    void testCreateBoardWithOneNullSquare() {
        BasicSquare x = new BasicSquare();
        Square[][] grid = {{x, null}};
        Board board = new Board(grid);
        assertThat(board.invariant()).isFalse();
        assertThat(board.squareAt(0, 1)).isNull();
    }
}
