package analyzer;

import java.rmi.Remote;
import java.util.List;

/**
 * Created by garik on 01.06.17.
 */
public interface StatisticsAnalyzer extends Remote {

    /**
     * Get last n string from core, which was in requests
     * @param n count of last String
     * @return List of last n String from requests from core
     */
    List<String> topRequests(int n);

    /**
     * Run StatisticsAnalyzer for user, which can be used from console
     */
    void run();
}
