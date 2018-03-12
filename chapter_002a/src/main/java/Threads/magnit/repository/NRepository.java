package Threads.magnit.repository;

import java.util.List;

public interface NRepository {

    void createTable();

    void insertRecords(int n);

    List<Integer> getRecords();
}
