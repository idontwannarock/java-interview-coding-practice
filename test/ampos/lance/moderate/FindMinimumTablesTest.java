package ampos.lance.moderate;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import ampos.lance.moderate.FindMinimumTables.TableReservation;

public class FindMinimumTablesTest {

    @Test
    public void shouldReturnThree() {
        List<TableReservation> customerList = new ArrayList<>();
        customerList.add(new TableReservation("11:00", "12:00"));
        customerList.add(new TableReservation("11:30", "12:30"));
        customerList.add(new TableReservation("11:40", "12:40"));
        customerList.add(new TableReservation("13:00", "14:00"));

        FindMinimumTables finder = new FindMinimumTables();
        assert 3 == finder.calculateMinTable(customerList);
    }
}
