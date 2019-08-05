package ampos.lance.moderate;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class FindMinimumTables {

    public int calculateMinTable(List<TableReservation> customerList) {
        // Implement a function that returns the minimum number of tables needed for a restaurant given the reserved check-in and check-out time.
        int maxTable = 0;
        for (LocalTime time = LocalTime.of(11, 00); time.isBefore(LocalTime.of(14, 10)); time = time.plusMinutes(10)) {
            LocalTime currentTime = time;
            int currentTimeTableNeeded = new Long(customerList.stream().filter(r -> r.isTableReservedAt(currentTime)).count()).intValue();
            if (maxTable < currentTimeTableNeeded) maxTable = currentTimeTableNeeded;
        }
        System.out.println("Max table needed is " + maxTable);
        return maxTable;
    }

    public static class TableReservation {
        LocalTime startTime;
        LocalTime endTime;

        public TableReservation(String startTime, String endTime) {
            this.startTime = LocalTime.parse(startTime, DateTimeFormatter.ofPattern("HH:mm"));
            this.endTime = LocalTime.parse(endTime, DateTimeFormatter.ofPattern("HH:MM"));
            System.out.println("Start from " + this.startTime.toString() + " to " + this.endTime.toString());
        }

        public boolean isTableReservedAt(LocalTime time) {
            return time.equals(startTime) || time.equals(endTime) || (time.isAfter(startTime) && time.isBefore(endTime));
        }
    }
}
