package chess.domain;

import chess.domain.board.Board;
import chess.domain.piece.Color;

import java.util.Map;
import java.util.Objects;

public final class Status {
    private final Map<Color, Double> whiteScore;
    private final Map<Color, Double> blackScore;
    private final Result result;

    public Status(final Color winnerColor, final Board board) {
        this.result = Result.from(winnerColor);
        this.whiteScore = board.sumScore(Color.WHITE);
        this.blackScore = board.sumScore(Color.BLACK);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Status status = (Status) o;
        return Objects.equals(whiteScore, status.whiteScore) && Objects.equals(blackScore, status.blackScore) && result == status.result;
    }

    @Override
    public int hashCode() {
        return Objects.hash(whiteScore, blackScore, result);
    }

    public Map<Color, Double> getWhiteScore() {
        return whiteScore;
    }

    public Map<Color, Double> getBlackScore() {
        return blackScore;
    }

    public Result getResult() {
        return result;
    }
}
