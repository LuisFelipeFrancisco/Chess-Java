package boardgame;

public abstract class Piece {

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

    public abstract boolean[][] possibleMoves();

    public boolean possibleMove(Position position) {
        return possibleMoves()[position.getRow()][position.getColumn()];
    }

    public boolean isThereAnyPossibleMove() {
        boolean[][] mat = possibleMoves();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (mat[i][j]) {
                    return true;
                }
            }
        }
        return false;
    }

}
