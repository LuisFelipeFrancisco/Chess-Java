package boardgame;

public class Piece {

    protected Position position;
    private Board board;

    // Vai ser inicializado apenas com o tabuleiro
    public Piece(Board board) {
        this.board = board;
    }

    // Somente classes do mesmo pacote ou subclasses podem acessar o método
    protected Board getBoard() {
        return board;
    }
}
