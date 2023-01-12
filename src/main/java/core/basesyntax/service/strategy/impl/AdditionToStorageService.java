package core.basesyntax.service.strategy.impl;

import core.basesyntax.model.FruitTransaction;
import core.basesyntax.service.TransactionProcessorService;
import java.util.Map;

public class AdditionToStorageService implements TransactionProcessorService {
    public AdditionToStorageService(FruitTransaction transaction, Map<String, Integer> fruits) {
        process(transaction, fruits);
    }

    @Override
    public void process(FruitTransaction transaction, Map<String, Integer> fruits) {
        String key = transaction.getFruit();
        fruits.put(key,fruits.get(key) + transaction.getQuantity());
    }
}
