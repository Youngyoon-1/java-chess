package domain.pieces;

import domain.move.Direction;
import domain.point.MovePoint;
import domain.point.Point;
import domain.team.Team;
import java.util.List;
import java.util.Map;

public class King extends Piece {

    private static final String INITIAL = "K";

    private static final double score = 0;
    private static final List<Direction> direction = Direction.getAllDirection();

    public King(Team team) {
        super(INITIAL, team);
    }

    @Override
    public boolean isMovable(Direction direction, Map<Point, Piece> pieces, MovePoint movePoint) {
        return Roles.isMovableLimitedCase(direction, movePoint);
    }

    @Override
    public boolean isNoneTeam() {
        return false;
    }

    @Override
    public List<Direction> getDirection(Team team) {
        return direction;
    }

    @Override
    public double getScore() {
        return score;
    }
}
