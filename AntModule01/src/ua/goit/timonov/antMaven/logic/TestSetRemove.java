package ua.goit.timonov.antMaven.logic;

import java.util.Set;

/**
 * Implementation of operation remove(value) for Set
 */
public class TestSetRemove extends TestSet {
    public TestSetRemove(Set collection, int nElements) {
        super(collection, nElements);
    }

    @Override
    protected void makeOperation(int value) {
        collection.remove(value);
    }
}
