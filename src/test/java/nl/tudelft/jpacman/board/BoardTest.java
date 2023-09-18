package nl.tudelft.jpacman.board;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class BoardTest {

    /**
     *  Asserts that a board has created with the grid 1x1.
     */
    @Test
    void testCreateBoard(){
        BasicSquare x = new BasicSquare();
        Square[][] grid = {{x}};
        Board board = new Board(grid);
        assertThat(board.invariant()).isTrue();
        assertThat(board.squareAt(0,0)).isEqualTo(grid[0][0]);
    }

    @Test
    void testCreateBoardWithOneNullSquare(){
        BasicSquare x = new BasicSquare();
        Square[][] grid = {{x, null}};
        Board board = new Board(grid);
        assertThat(board.invariant()).isFalse();
        assertThat(board.squareAt(0,1)).isNull();
    }
}
