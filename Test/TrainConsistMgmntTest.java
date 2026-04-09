import java.util.*;

public class TrainConsistMgmntTest {
    public void testBogieSortingLogic() {
        List<TrainConsistMgmnt.Bogie> bogies = new ArrayList<>();
        bogies.add(new TrainConsistMgmnt.Bogie("Sleeper", 72));
        bogies.add(new TrainConsistMgmnt.Bogie("General", 90));
        bogies.add(new TrainConsistMgmnt.Bogie("First Class", 24));
        bogies.sort(Comparator.comparingInt(b -> b.capacity));
        assertEquals(24, bogies.get(0).capacity);
        assertEquals("First Class", bogies.get(0).name);
    }

    public void testHighestCapacityPosition() {
        List<TrainConsistMgmnt.Bogie> bogies = new ArrayList<>();
        bogies.add(new TrainConsistMgmnt.Bogie("Sleeper", 72));
        bogies.add(new TrainConsistMgmnt.Bogie("General", 90));
        bogies.add(new TrainConsistMgmnt.Bogie("First Class", 24));
        bogies.sort(Comparator.comparingInt(b -> b.capacity));
        int lastIndex = bogies.size() - 1;
        assertEquals(90, bogies.get(lastIndex).capacity);
        assertEquals("General", bogies.get(lastIndex).name);
    }

    private static void assertEquals(Object expected, Object actual) {
        if (!Objects.equals(expected, actual)) {
            throw new AssertionError("Expected: " + expected + ", but was: " + actual);
        }
    }

    public static void main(String[] args) {
        TrainConsistMgmntTest test = new TrainConsistMgmntTest();
        test.testBogieSortingLogic();
        test.testHighestCapacityPosition();
        System.out.println("All tests passed.");
    }
}