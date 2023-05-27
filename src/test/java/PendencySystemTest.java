import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

import org.junit.Test;

import phonepe.Count;
import phonepe.GetCountFactory;
import phonepe.InmemoryDatastructure;
import phonepe.StartTracking;
import phonepe.StartTrackingFactory;
import phonepe.StopTracking;
import phonepe.StopTrackingFactory;

public class PendencySystemTest {
    @Test
    public void testPendencySystem() {
        InmemoryDatastructure inmemoryDatastructure = new InmemoryDatastructure();
        Map<Integer, ArrayList<String>> imds =  inmemoryDatastructure.startTrack;

        StartTrackingFactory startTrackingFactory = new StartTrackingFactory();
        StartTracking startTracking = startTrackingFactory.getStartTracking("startTrackingByID");

        StopTrackingFactory stopTrackingFactory = new StopTrackingFactory();
        StopTracking stopTracking =  stopTrackingFactory.getStopTracking("stopTrackingByID");

        GetCountFactory getCountFactory = new GetCountFactory();
        Count count = getCountFactory.getCount("countbytag");

        startTracking.startTracking(1112,new ArrayList<>(Arrays.asList("UPI", "Karnataka", "Bangalore")),imds);
        startTracking.startTracking(2451,new ArrayList<>(Arrays.asList("UPI", "Karnataka", "Mysore")),imds);
        startTracking.startTracking(11342112,new ArrayList<>(Arrays.asList("UPI", "Rajasthan", "Jaipur")),imds);
        startTracking.startTracking(1221,new ArrayList<>(Arrays.asList("Wallet", "Karnataka", "Bangalore")),imds);

        System.out.println(count.getCounts(new ArrayList<>(Arrays.asList("UPI")), imds));
        System.out.println(count.getCounts(new ArrayList<>(Arrays.asList("UPI", "Karnataka")), imds));
        System.out.println(count.getCounts(new ArrayList<>(Arrays.asList("UPI", "Karnataka", "Bangalore")), imds));
        System.out.println(count.getCounts(new ArrayList<>(Arrays.asList("Bangalore")), imds));

        startTracking.startTracking(4221,new ArrayList<>(Arrays.asList("Wallet", "Karnataka", "Bangalore")),imds);

        stopTracking.stopTracking(1112,imds);
        stopTracking.stopTracking(2451,imds);

        System.out.println(count.getCounts(new ArrayList<>(Arrays.asList("UPI")), imds));
        System.out.println(count.getCounts(new ArrayList<>(Arrays.asList("Wallet")), imds));
        System.out.println(count.getCounts(new ArrayList<>(Arrays.asList("UPI", "Karnataka", "Bangalore")), imds));
    }
}