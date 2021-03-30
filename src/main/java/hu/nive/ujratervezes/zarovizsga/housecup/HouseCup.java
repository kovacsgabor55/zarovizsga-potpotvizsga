package hu.nive.ujratervezes.zarovizsga.housecup;

import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.*;

public class HouseCup {
    private final MariaDbDataSource dataSource;

    public HouseCup(MariaDbDataSource dataSource) {
        this.dataSource = dataSource;
    }

    public int getPointsOfHouse(String houdse) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("SELECT `points_earned` FROM `house_points` WHERE `house_name` LIKE ?;")) {
            stmt.setString(1, houdse);
            return execute(stmt);
        } catch (SQLException se) {
            throw new IllegalStateException("Cannot connect", se);
        }
    }

    private int execute(PreparedStatement stmt) {
        try (ResultSet rs = stmt.executeQuery()) {
            int point = 0;
            while (rs.next()) {
                point += rs.getInt("points_earned");
            }
            return point;
        } catch (SQLException sqle) {
            throw new IllegalArgumentException("Cannot select house", sqle);
        }
    }
}
