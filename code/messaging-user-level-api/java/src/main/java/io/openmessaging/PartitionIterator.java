package io.openmessaging;

//�־û�
public interface PartitionIterator {
    long currentOffset();

    long firstOffset();

    long lastOffset();

    void seekByTime(long timestamp);

    void seekByOffset(long offset);

    void persist();

    Message next();

    Message previous();
}
